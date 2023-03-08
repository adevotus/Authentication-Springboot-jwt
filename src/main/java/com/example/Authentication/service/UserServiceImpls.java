package com.example.Authentication.service;

import com.example.Authentication.domain.Role;
import com.example.Authentication.domain.UserModel;
import com.example.Authentication.repository.RoleRepository;
import com.example.Authentication.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImpls implements UserService{
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;



    @Override
    public UserModel saveUserData(UserModel userModel) {
        log.info("Saving to user new data",userModel.getName());
        return userRepository.save(userModel);
    }

    @Override
    public Role saveRoleData(Role role) {
        log.info("Saving to  new role", role.getName());

        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {

        UserModel userModel = userRepository.findByUsername(username);
        Role role = roleRepository.findByName(roleName);
        userModel.getRoles().add(role);
    }

    @Override
    public UserModel getUserData(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<UserModel> getUsersData() {
        return userRepository.findAll();
    }
}