package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.dto;

import java.io.Serializable;

public class AuthResponse implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
    private String name;
    private String email;
    private String token;

    // Constructor
    public AuthResponse(Long id2, String name2, String email2, String token2) {
        this.id = id2;
        this.name = name2;
        this.email = email2;
        this.token = token2;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}


//package com.protonpreschool.schoolmanagement.dto;
//
//import com.protonpreschool.schoolmanagement.model.Role;
//import java.util.Set;
//
//public class AuthResponse {
//    private Long id;
//    private String name;
//    private String username;
//    private String token;
//    private Set<Role> roles;
//
//    public AuthResponse(Long id, String username, String token, Set<Role> roles) {
//        this.id = id;
//        this.username = username;
//        this.token = token;
//        this.roles = roles;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public String getToken() {
//        return token;
//    }
//
//    public Set<Role> getRoles() {
//        return roles;
//    }
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//}


//package com.protonpreschool.schoolmanagement.dto;
//
//public class AuthResponse {
//    private String accessToken;
//    private String tokenType = "Bearer";
//
//    // ✅ No-args constructor
//    public AuthResponse() {
//    }
//
//    // ✅ Constructor matching the expected parameters
//    public AuthResponse(String accessToken) {
//        this.accessToken = accessToken;
//        this.tokenType = "Bearer";
//    }
//
//    // ✅ Getters & Setters
//    public String getAccessToken() {
//        return accessToken;
//    }
//
//    public void setAccessToken(String accessToken) {
//        this.accessToken = accessToken;
//    }
//
//    public String getTokenType() {
//        return tokenType;
//    }
//
//    public void setTokenType(String tokenType) {
//        this.tokenType = tokenType;
//    }
//}
