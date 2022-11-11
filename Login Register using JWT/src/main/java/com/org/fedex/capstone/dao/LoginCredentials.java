package com.org.fedex.capstone.dao;

import lombok.*;

@Getter // Defines the getter methods of the member fields
@Setter // Defines the setter methods of the member fields
@AllArgsConstructor // Defines a constructor that initializes all the member fields
@NoArgsConstructor // Defines no-args default constructor
@ToString // Defines a meaningful toString implementation of this class
public class LoginCredentials {

    
	private String username;
    private String password;
    
   
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
