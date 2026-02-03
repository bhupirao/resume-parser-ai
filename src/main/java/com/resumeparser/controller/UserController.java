package com.resumeparser.controller;

import com.resumeparser.entity.User;
import com.resumeparser.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // POST API
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    // GET API
    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }
}
