package com.example.cwp.controller;

import com.example.cwp.service.KakoLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class KakaoLoginController {

    @Autowired
    private KakoLoginService kakoLoginService;

    @GetMapping("/auth/kakao/callback")
    public String kakaoCallback(String code){

        kakoLoginService.kakaoLogin(code);

        return "redirect:/";


    }
}
