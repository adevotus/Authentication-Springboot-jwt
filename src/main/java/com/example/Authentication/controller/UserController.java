package com.example.Authentication.controller;


import com.example.Authentication.domain.UserModel;
import com.example.Authentication.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<UserModel>>getUsersData(){
        return ResponseEntity.ok().body(userService.getUsersData());
    }
}
