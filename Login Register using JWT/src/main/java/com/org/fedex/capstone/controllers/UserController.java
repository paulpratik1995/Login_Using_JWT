package com.org.fedex.capstone.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.fedex.capstone.entity.User;
import com.org.fedex.capstone.repository.UserRepo;


@RestController // Marks the class a rest controller
@RequestMapping("/capstone/user") // Requests made to /api/auth/anything will be handles by this class
public class UserController {

    // Injecting Dependencies
    @Autowired private UserRepo userRepo;

    // Defining the function to handle the GET route to fetch user information of the authenticated user
    @GetMapping("/info")
    public User getUserDetails(){
        // Retrieve username from the Security Context
        String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        // Fetch and return user details
        return userRepo.findByUsername(username).get();
    }


}
