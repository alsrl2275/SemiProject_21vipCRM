package com.web.config;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import com.web.domain.Member;

public class SecurityUser extends User{
	private static final long serialVersionUID = 1L;

	public SecurityUser(Member member) {
		super(member.getUsername(), member.getPassword(), 
				AuthorityUtils.createAuthorityList(member.getMemberRole().toString()));
	}
	

}
