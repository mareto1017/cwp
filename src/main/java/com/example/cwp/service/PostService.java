package com.example.cwp.service;

import com.example.cwp.dto.Category;
import com.example.cwp.dto.GroupDto;
import com.example.cwp.dto.Transport;
import com.example.cwp.entity.Group;
import com.example.cwp.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private final GroupRepository groupRepository;

    public PostService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }



    @Transactional
    public void write(GroupDto groupDto) {
        Group group = new Group(groupDto);
        groupRepository.save(group);

    }

    @Transactional
    public void update(Long id, GroupDto groupDto) {
        Group group = groupRepository.findById(id).get();
        group.setTitle(groupDto.getTitle());
        group.setCategory(groupDto.getCategory());
        group.setLocation(groupDto.getLocation());
        group.setContent(groupDto.getContent());
        group.setStartTime(groupDto.getStartTime());
        groupRepository.save(group);

    }

    @Transactional
    public void delete(Long id) {

        groupRepository.deleteById(id);

    }
}


