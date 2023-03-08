package com.example.Authentication.service;


import com.example.Authentication.domain.Role;
import com.example.Authentication.domain.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    UserModel saveUserData(UserModel userModel);

    Role saveRoleData(Role role);

    void addRoleToUser(String username , String roleName);

    UserModel getUserData(String username);

    List<UserModel>getUsersData();
}
