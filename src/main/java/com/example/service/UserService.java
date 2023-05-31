package com.example.service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;
    public List<User> users(){
        return userRepository.findAll();
    }
    public User add(User user){
        return userRepository.save(user);
    }
}
