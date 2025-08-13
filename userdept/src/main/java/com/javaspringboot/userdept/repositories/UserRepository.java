package com.javaspringboot.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaspringboot.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}