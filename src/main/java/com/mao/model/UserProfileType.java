package com.mao.model;

import java.io.Serializable;

public enum UserProfileType implements Serializable{
	ADMIN("ADMIN"),
	DBA("DBA"),
	USER("USER");
	
	String UserProfileType;
	
	private UserProfileType(String userProfileType) {
		this.UserProfileType = userProfileType;
	}
	
	public String getUserProfileType() {
		return UserProfileType;
	}
}
