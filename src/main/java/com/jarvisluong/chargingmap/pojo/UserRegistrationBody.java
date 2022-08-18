package com.jarvisluong.chargingmap.pojo;

import com.jarvisluong.chargingmap.annotations.IsPhoneNumber;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UserRegistrationBody {
    @IsPhoneNumber
    @NotEmpty
    private String phoneNumber;
}
