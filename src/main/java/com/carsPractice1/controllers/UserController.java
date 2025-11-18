package com.carsPractice1.controllers;

import com.carsPractice1.dtos.UserDTO;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping
    public List<UserDTO> getAllUsers(){
        return List.of(
                new UserDTO(1L, "Javizzz", "javiz@gmail.com", "123"),
                new UserDTO(2L, "Eusebiooo", "eusebio@gmail.com", "456")
        );
    }

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO data) {
        return new UserDTO(3L, data.name(), data.email(), data.password());
    }

}
