package com.jarvisluong.chargingmap.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ChargingUser {

    /**
     * Status dictates how user is managed, from when they start
     * registering, to validated phone number. Later on we might
     * be able to block a user.
     */
    public enum Status {
        NOT_VALIDATED,
        VALIDATED
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String phoneNumber;

    private Status status;
}
