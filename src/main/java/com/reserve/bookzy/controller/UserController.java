package com.reserve.bookzy.controller;

import com.reserve.bookzy.model.User;
import com.reserve.bookzy.repository.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class UserController {

    @Autowired
    UserRepo userRepository;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        try {
            return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Error details : ", e);
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
