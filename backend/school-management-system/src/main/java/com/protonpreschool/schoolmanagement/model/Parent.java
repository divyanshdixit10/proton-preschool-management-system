package com.protonpreschool.schoolmanagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "parents")
public class Parent extends BaseEntity {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String phone;
    private String address;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

	
    
    public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
