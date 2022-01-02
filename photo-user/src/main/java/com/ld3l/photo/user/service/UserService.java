package com.ld3l.photo.user.service;

import com.ld3l.photo.user.domain.model.CreateUserModel;

public interface UserService {
    Long createUser(CreateUserModel user);
}
