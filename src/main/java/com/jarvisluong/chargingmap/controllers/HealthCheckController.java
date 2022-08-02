package com.jarvisluong.chargingmap.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthCheckController {

    @GetMapping("/health-check")
    public Map<String, String> check() {
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "ok");
        return map;
    }
}
