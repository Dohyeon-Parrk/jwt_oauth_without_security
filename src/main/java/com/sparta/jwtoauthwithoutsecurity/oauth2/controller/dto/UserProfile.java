package com.sparta.jwtoauthwithoutsecurity.oauth2.controller.dto;

import com.sparta.jwtoauthwithoutsecurity.oauth2.entity.Member;

import lombok.Builder;
import lombok.Getter;

@Getter
public class UserProfile {
	private final String oauthId;
	private final String email;
	private final String name;
	private final String imageUrl;

	@Builder
	public UserProfile(String oauthId, String email, String name, String imageUrl) {
		this.oauthId = oauthId;
		this.email = email;
		this.name = name;
		this.imageUrl = imageUrl;
	}

	public Member toMember() {
		return Member.builder()
			.oauthId(oauthId)
			.email(email)
			.name(name)
			.imageUrl(imageUrl)
			.role(Role.GUEST)
			.build();
	}
}