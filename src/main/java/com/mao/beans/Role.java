package com.mao.beans;

public enum Role {

	ADMIN(1), PRODUCTION_DEPARTMENT(2), LABORATORY_DEPARTMENT(3), SERVICE_DESK(4), NO_PERMISSIONS(100);
	
	private Role(int id) {
		this.id = id;
	}

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id){
		this.id = id;
	}
	
	public static Role getRole(int id) {

		switch (id) {
		case 1:
			return ADMIN;
		
		case 2:
			return PRODUCTION_DEPARTMENT;

		case 3:
			return LABORATORY_DEPARTMENT;
			
		case 4:
			return SERVICE_DESK;
		case 100:
			return NO_PERMISSIONS;
			
		default:
			throw new IllegalArgumentException("Role not found");
			
		}
	}
}
