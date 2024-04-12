package com.way.wayapiserver.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.way.wayapiserver.data.entity.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
