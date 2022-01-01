package com.ld3l.photo.user.Controller;

import com.ld3l.photo.user.domain.model.CreateUserModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {
    @PostMapping
    public String createUser(@Valid @RequestBody CreateUserModel model) {
        return model.getFirstName();
    }
}
