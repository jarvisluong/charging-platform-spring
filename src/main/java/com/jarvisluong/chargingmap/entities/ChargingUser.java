package com.jarvisluong.chargingmap.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String phoneNumber;

    private Status status;
}
