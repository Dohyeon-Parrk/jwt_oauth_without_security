package com.sparta.jwtoauthwithoutsecurity.oauth2.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

// 인증 제공자 정보 구성
@Getter
@ConfigurationProperties(prefix = "oauth2")	// 프로퍼티 값을 객체로 바인딩 받을 수 있게 객체 생성
public class OauthProperties {

	private final Map<String, User> user = new HashMap<>();
	private final Map<String, Provider> provider = new HashMap<>();

	@Getter
	@Setter
	public static class User {
		private String clientId;
		private String clientSecret;
		private String redirectUri;
	}

	@Getter
	@Setter
	public static class Provider{
		private String tokenUri;
		private String userInfoUri;
		private String userNameAttribute;
	}
}
