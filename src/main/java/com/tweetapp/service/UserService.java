package com.tweetapp.service;

import com.tweetapp.entity.UserEntity;
import com.tweetapp.repository.UserRepository;
import com.tweetapp.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public UserEntity findUserById(String emailId) {
        return repo.findById(emailId).orElseThrow(() -> new UserNotFoundException("User not found"));
    }

    public List<UserEntity> findAllUsers() {
        List<UserEntity> list = new ArrayList();
        list = repo.findAll();
        return list;
    }

    public void createUser(UserEntity user) {
        repo.save(user);
    }
}
