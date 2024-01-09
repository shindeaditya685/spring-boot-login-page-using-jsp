package com.web.springwebapplication.controller;

import com.web.springwebapplication.dto.UserDTO;
import com.web.springwebapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String viewRegisterForm() {
        return "userRegisterForm"; // userRegisterForm.jsp file name you have to return.
    }

    @PostMapping("saveUser") // <form name="userForm"  action="saveUser" method="POST">
    public String saveUser(UserDTO userDTO, Map<String, Object> map) {

        Boolean userExists = userService.findByEmail(userDTO.getEmail());

        if (userExists) {
            map.put("errorMessage", "User already exists");
        } else {
            userService.saveUser(userDTO);
            map.put("message", "User Registered Successfully");
        }

        return "userRegisterForm";
    }
}
