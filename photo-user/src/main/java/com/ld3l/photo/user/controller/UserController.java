package com.ld3l.photo.user.controller;

import com.ld3l.photo.user.domain.model.CreateUserModel;
import com.ld3l.photo.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController()
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

   private UserService userService;

    @PostMapping
    public ResponseEntity<Long> createUser(@Valid @RequestBody CreateUserModel model) {
        Long id = userService.createUser(model);
        return new ResponseEntity<>(id, HttpStatus.CREATED);
    }
}
