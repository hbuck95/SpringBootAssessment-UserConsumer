package com.bae.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bae.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
