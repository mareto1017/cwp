package com.example.cwp.controller;


import com.example.cwp.dto.GroupDto;
import com.example.cwp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/write")
    public void write(GroupDto groupDto){
        postService.write(groupDto);

    }
    
}
