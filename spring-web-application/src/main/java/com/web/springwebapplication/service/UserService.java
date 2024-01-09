package com.web.springwebapplication.service;

import com.web.springwebapplication.dto.UserDTO;

public interface UserService {
    void saveUser(UserDTO userDTO);

    Boolean findByEmail(String email);
}
