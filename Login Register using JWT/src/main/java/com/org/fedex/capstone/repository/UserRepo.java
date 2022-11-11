package com.org.fedex.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.org.fedex.capstone.entity.User;

import java.util.Optional;

import javax.transaction.Transactional;

// Defines a repository which provides an API or a list of helpful functions
// that helps us to work with the User entity
public interface UserRepo extends JpaRepository<User, Long> {
    // Defines a custom method to find a User using the email attribute
	//@Transactional
	//@Query(value="SELECT * fROM user where username=?",nativeQuery=true)
    public Optional<User> findByUsername(String username);
}
