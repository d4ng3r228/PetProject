package com.example.controller;

import com.example.dto.response.user.UserResponse;
import com.example.mapper.UserMapperImpl;
import com.example.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    private UserService userService;
    private UserMapperImpl userMapper;

    @GetMapping
    public List<UserResponse> users(){
        return userService.users().stream().map(userMapper::toDto).toList();
    }

}
