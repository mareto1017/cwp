package com.example.cwp.repository;

import com.example.cwp.dto.Category;
import com.example.cwp.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {

    List<Group> findByTitle(String title);

    List<Group> findByCategory(Category category);


}
