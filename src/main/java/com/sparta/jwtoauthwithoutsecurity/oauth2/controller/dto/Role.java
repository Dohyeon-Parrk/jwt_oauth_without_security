package com.sparta.jwtoauthwithoutsecurity.oauth2.controller.dto;

public enum Role {
	GUEST("ROLE_GUEST"),
	USER("ROLE_USER");

	private final String key;

	Role(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}
}
