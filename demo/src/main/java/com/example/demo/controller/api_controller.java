package com.example.demo.controller;

import com.example.demo.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class api_controller {

    @Autowired
    private service api_service;

    @GetMapping("/api/publicapi")
    public String fetchUsers(){
        return api_service.getUsersfromapi();
    }


}
