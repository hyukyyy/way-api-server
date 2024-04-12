package com.way.wayapiserver.api.user.model;

import lombok.Getter;

@Getter
public enum SIGNUP_ERROR_MESSAGE {
	USERNAME_ALREADY_EXIST("이미 존재하는 아이디입니다.");
	
	private final String msg;
	SIGNUP_ERROR_MESSAGE(String msg) {
		this.msg = msg;
	}
}
