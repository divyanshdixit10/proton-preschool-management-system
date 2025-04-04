package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequest {
    private String name;
    private String email;
    private String password;
	
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}


//package com.protonpreschool.schoolmanagement.dto;
//
//import java.util.Set;
//
//public class RegisterRequest {
//    private String username;
//    private String email;
//    private String password;
//    private Set<String> roles;  // ✅ Add this field
//
//    // ✅ Constructor
//    public RegisterRequest() {
//    }
//
//    public RegisterRequest(String username, String email, String password, Set<String> roles) {
//        this.username = username;
//        this.email = email;
//        this.password = password;
//        this.roles = roles;
//    }
//
//    // ✅ Getters & Setters
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Set<String> getRoles() {  // ✅ Add this method
//        return roles;
//    }
//
//    public void setRoles(Set<String> roles) {
//        this.roles = roles;
//    }
//}
