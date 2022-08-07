package com.jarvisluong.chargingmap.service;

import com.jarvisluong.chargingmap.entities.ChargingUser;
import com.jarvisluong.chargingmap.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ChargingUser createNewUser(String phoneNumber) {
        var user = new ChargingUser();
        user.setPhoneNumber(phoneNumber);
        user.setStatus(ChargingUser.Status.NOT_VALIDATED);
        return userRepository.save(user);
    }
}
