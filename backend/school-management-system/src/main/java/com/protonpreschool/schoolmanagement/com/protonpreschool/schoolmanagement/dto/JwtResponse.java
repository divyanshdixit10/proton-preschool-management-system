package com.protonpreschool.schoolmanagement.com.protonpreschool.schoolmanagement.dto;

import lombok.Data;

@Data
public class JwtResponse {
    private String token;

    public JwtResponse(String token) {
        this.setToken(token);
    }

	
    public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
