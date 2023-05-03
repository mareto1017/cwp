package com.example.cwp.controller;

import com.example.cwp.dto.Category;
import com.example.cwp.dto.GroupDto;
import com.example.cwp.dto.Transport;
import com.example.cwp.entity.Group;
import com.example.cwp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchController {


    @Autowired
    private PostService postService;


    @GetMapping("/search/main")
    public List<GroupDto> findAll() {
        List<Group> groupList = postService.findAll();
        List<GroupDto> groupDtoList = new ArrayList<>();
        for (Group group : groupList) {
            groupDtoList.add(new GroupDto(group));
        }

        return groupDtoList;
    }

    @GetMapping("/search/title")
    public List<GroupDto> findByTitle(String title) {
        List<Group> groupList = postService.findByTitle(title);
        List<GroupDto> groupDtoList = new ArrayList<>();
        for (Group group : groupList) {
            groupDtoList.add(new GroupDto(group));
        }

        return groupDtoList;

    }


    @GetMapping("/search/Category")
    public List<GroupDto> findByCategory(Category category) {
        List<Group> groupList = postService.findByCategory(category);
        List<GroupDto> groupDtoList = new ArrayList<>();
        for (Group group : groupList) {
            groupDtoList.add(new GroupDto(group));
        }

        return groupDtoList;
    }

    @GetMapping("/search/CategoryAndTransport")
    public List<GroupDto> findByCategoryAndTransport(Category category, Transport transport) {
        List<Group> groupList = postService.findByCategoryAndTransport(category, transport);
        List<GroupDto> groupDtoList = new ArrayList<>();
        for (Group group : groupList) {
            groupDtoList.add(new GroupDto(group));
        }

        return groupDtoList;
    }


}

