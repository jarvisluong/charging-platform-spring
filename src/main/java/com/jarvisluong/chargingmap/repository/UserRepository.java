package com.jarvisluong.chargingmap.repository;

import com.jarvisluong.chargingmap.entities.ChargingUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<ChargingUser, Long> {
    ChargingUser findChargingUserByPhoneNumber(String phoneNumber);
}
