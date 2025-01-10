package com.sparta.jwtoauthwithoutsecurity.oauth2.entity;

import com.sparta.jwtoauthwithoutsecurity.oauth2.controller.dto.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;

@Getter
@Entity
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String oauthId;

	private String name;

	private String email;

	private String imageUrl;

	@Enumerated(EnumType.STRING)
	private Role role;

	protected Member() {
	}

	@Builder
	public Member(Long id, String oauthId, String name, String email, String imageUrl, Role role) {
		this.id = id;
		this.oauthId = oauthId;
		this.name = name;
		this.email = email;
		this.imageUrl = imageUrl;
		this.role = role;
	}

	public Member update(String name, String email, String imageUrl) {
		this.name = name;
		this.email = email;
		this.imageUrl = imageUrl;
		return this;
	}
}