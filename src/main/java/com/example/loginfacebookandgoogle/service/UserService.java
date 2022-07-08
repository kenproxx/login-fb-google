package com.example.loginfacebookandgoogle.service;

import com.example.loginfacebookandgoogle.modal.User;
import com.example.loginfacebookandgoogle.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    //save
    public User save(User user) {
        return userRepository.save(user);
    }

    //find by id
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    //delete by id
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

}
