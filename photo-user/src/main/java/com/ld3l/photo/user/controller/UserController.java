package com.ld3l.photo.user.controller;

import com.ld3l.photo.user.domain.model.CreateUserModel;
import com.ld3l.photo.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
public class UserController {

   private UserService userService;

    @PostMapping
    public String createUser(@Valid @RequestBody CreateUserModel model) {
        userService.createUser(model);
        return model.getFirstName();
    }
}
