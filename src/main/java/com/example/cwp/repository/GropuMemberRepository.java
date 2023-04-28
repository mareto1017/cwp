package com.example.cwp.repository;

import com.example.cwp.entity.GroupMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GropuMemberRepository extends JpaRepository<GroupMember, Long> {

}
