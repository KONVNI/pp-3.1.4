package com.app.demo.service;


import com.app.demo.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;


public interface UserService extends UserDetailsService {
    List<User> getUserList();

    User getUser(int id);

    void saveUser(User user);

    void deleteUser(int id);

    void updateUser(User user);

    User getUserByEmail(String email);
}
