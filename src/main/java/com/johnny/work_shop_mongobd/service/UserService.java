package com.johnny.work_shop_mongobd.service;

import com.johnny.work_shop_mongobd.domain.User;
import com.johnny.work_shop_mongobd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return this.userRepository.findAll();
    }
}
