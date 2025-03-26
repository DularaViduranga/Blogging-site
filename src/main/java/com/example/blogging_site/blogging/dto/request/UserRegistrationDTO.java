package com.example.blogging_site.blogging.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRegistrationDTO {
    private String userName;
    private String password;
    private String email;
    private Set<String> roles;
}
