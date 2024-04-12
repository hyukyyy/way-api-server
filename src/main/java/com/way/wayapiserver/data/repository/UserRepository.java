package com.way.wayapiserver.data.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.way.wayapiserver.data.dto.UserDto;
import com.way.wayapiserver.data.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
	User save(UserDto user);
	Optional<User> findOneWithAuthoritiesByUsername(String username);
	Optional<User> findOneWithGroupsByUsername(String username);
}
