package com.sparta.jwtoauthwithoutsecurity.oauth2.provider;

import com.sparta.jwtoauthwithoutsecurity.oauth2.config.OauthProperties;

import lombok.Builder;
import lombok.Getter;

// Spring Security 의 ClientRegistration 역할 -> OauthProperties 를 각 OAuth 서버 정보로 나눠서 InMemory 저장소에 저장
@Getter
public class OauthProvider {
	private final String clientId;
	private final String clientSecret;
	private final String redirectUrl;
	private final String tokenUrl;
	private final String userInfoUrl;

	public OauthProvider(OauthProperties.User user, OauthProperties.Provider provider){
		this.clientId = user.getClientId();
		this.clientSecret = user.getClientSecret();
		this.redirectUrl = user.getRedirectUri();
		this.tokenUrl = provider.getTokenUri();
		this.userInfoUrl = provider.getUserInfoUri();
	}

	@Builder
	public OauthProvider(String clientId, String clientSecret, String redirectUrl, String tokenUrl, String userInfoUrl) {
		this.clientId = clientId;
		this.clientSecret = clientSecret;
		this.redirectUrl = redirectUrl;
		this.tokenUrl = tokenUrl;
		this.userInfoUrl = userInfoUrl;
	}
}
