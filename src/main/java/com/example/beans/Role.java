package com.example.beans;

public enum Role {

	ADMIN(1), PRODUCTION_DEPARTMENT(2), LABORATORY_DEPARTMENT(3);
	
	private Role(int id) {
		this.id = id;
	}

	private int id;

	public int getId() {
		return id;
	}

	public int setId(int id){
		this.id = id;
	}
	
	public static Role getRole(int id) {
		switch (id) {
		case 1:
			return ADMIN;
			break;
		case 2:
			return PRODUCTION_DEPARTMENT;
			break;
			
		case 3:
			return LABORATORY_DEPARTMENT;
			
			break;
		default:
			System.out.println("Role not found");
			break;
		}
		
	}

}
