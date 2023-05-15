package com.example.cwp.controller;


import com.example.cwp.dto.GroupDto;
import com.example.cwp.dto.UserDto;
import com.example.cwp.entity.Group;
import com.example.cwp.repository.GroupRepository;
import com.example.cwp.repository.UserRepository;
import com.example.cwp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @Autowired
    private GroupRepository groupRepository;

    @PostMapping("/write")
    public void write(@RequestBody GroupDto groupDto){
        postService.write(groupDto);

    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable Long id, @RequestBody GroupDto requestGroupDto){
        postService.update(id, requestGroupDto);

    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        postService.delete(id);

    }
    
}
