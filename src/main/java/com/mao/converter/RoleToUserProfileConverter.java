package com.mao.converter;

import org.springframework.core.convert.converter.Converter;

import com.mao.model.UserProfile;

/**
 * A converter class used in views to map id's to actual userProfile objects.
 */

public class RoleToUserProfileConverter implements Converter<Object, UserProfile>{

	@Override
	public UserProfile convert(Object element) {
		// TODO Auto-generated method stub
		Integer id = Integer.parseInt((String)element);
		
		return null;
	}
	
	
	
}
	
