package com.ld3l.photo.user.mapper;

import com.ld3l.photo.user.domain.dto.UserDto;
import com.ld3l.photo.user.domain.entity.UserEntity;
import com.ld3l.photo.user.domain.model.CreateUserModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {
    @Mapping(target = "id", ignore = true)
    UserEntity createUserModelToUserEntity(CreateUserModel model);
    UserDto userEntityToUserDto(UserEntity user);
}
