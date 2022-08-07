package com.jarvisluong.chargingmap.controllers;

import com.jarvisluong.chargingmap.entities.ChargingUser;
import com.jarvisluong.chargingmap.pojo.UserRegistrationBody;
import com.jarvisluong.chargingmap.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ChargingUser register(@Valid @RequestBody UserRegistrationBody body) {
        var phoneNumber = body.getPhoneNumber();
        return userService.createNewUser(phoneNumber);
    }
}
