package com.example.Authentication.repository;

import com.example.Authentication.domain.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel , Long> {
    UserModel findByUsername(String username);
}
