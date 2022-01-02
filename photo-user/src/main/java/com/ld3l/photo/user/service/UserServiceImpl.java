package com.ld3l.photo.user.service;

import com.ld3l.photo.user.domain.entity.UserEntity;
import com.ld3l.photo.user.domain.model.CreateUserModel;
import com.ld3l.photo.user.mapper.UserMapper;
import com.ld3l.photo.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;
    private UserRepository userRepository;
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public Long createUser(CreateUserModel user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        UserEntity userEntity = userMapper.createUserModelToUserEntity(user);
        return userRepository.save(userEntity).getId();
    }
}
