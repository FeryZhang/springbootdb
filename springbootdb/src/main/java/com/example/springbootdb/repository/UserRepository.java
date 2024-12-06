package com.example.springbootdb.repository;

import com.example.springbootdb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // You can add custom queries here if needed
}

