package com.ld3l.photo.user.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserModel {
    @NotNull(message = "Name cannot be null")
    @Size(min=2,message = "Name must not to be less than two characters")
    private String firstName;
    @NotNull(message = "Name cannot be null")
    @Size(min=2,message = "Name must not to be less than two characters")
    private String lastName;
    @NotNull(message = "Email cannot be null")
    @Email
    private String email;
    @NotNull(message = "Password cannot be null")
    @Size(min=8,max=16,message = "The length of the password must be from 8 to 16 characters long")
    private String password;
}
