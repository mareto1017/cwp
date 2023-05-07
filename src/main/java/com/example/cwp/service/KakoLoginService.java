package com.example.cwp.service;

import com.example.cwp.dto.UserDto;
import com.example.cwp.entity.User;
import com.example.cwp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class KakoLoginService {

    private final UserRepository userRepository;
    private final KakaoOAuth kakaoOAuth;
    private final AuthenticationManager authenticationManager;

    @Autowired
    public KakoLoginService(UserRepository userRepository, KakaoOAuth kakaoOAuth, AuthenticationManager authenticationManager) {
        this.userRepository = userRepository;
        this.kakaoOAuth = kakaoOAuth;
        this.authenticationManager = authenticationManager;
    }

    public void kakaoLogin(String authorizedCode) {
        UserDto userInfo = kakaoOAuth.getUserInfo(authorizedCode);
        String nickname = userInfo.getName();
        String email = userInfo.getEmail();

        String username = nickname;

        User kakaoUser = userRepository.findByEmail(email).orElse(null);

        // 카카오 정보로 회원가입
        if (kakaoUser == null) {

            kakaoUser = User.builder().name(username).email(email).build();
            userRepository.save(kakaoUser);
        }


        Authentication kakaoUsernamePassword = new UsernamePasswordAuthenticationToken(email, null);
        Authentication authentication = authenticationManager.authenticate(kakaoUsernamePassword);
        SecurityContextHolder.getContext().setAuthentication(authentication);
    }
}
