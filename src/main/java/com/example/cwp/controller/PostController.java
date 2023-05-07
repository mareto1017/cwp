package com.example.cwp.controller;


import com.example.cwp.dto.GroupDto;
import com.example.cwp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/write")
    public void write(GroupDto groupDto){
        postService.write(groupDto);

    }

    @PutMapping("/update")
    public void update(GroupDto groupDto){
        postService.update(groupDto);

    }

    @DeleteMapping("/delete")
    public void delete(GroupDto groupDto){
        postService.delete(groupDto);

    }
    
}
