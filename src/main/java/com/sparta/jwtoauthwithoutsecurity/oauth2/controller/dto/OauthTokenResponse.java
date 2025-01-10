package com.sparta.jwtoauthwithoutsecurity.oauth2.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class OauthTokenResponse {

	@JsonProperty("access_Token")
	private String accessToken;

	private String scope;

	@JsonProperty("token_type")
	private String tokenType;

	@Builder
	public OauthTokenResponse(String accessToken, String scope, String tokenType) {
		this.accessToken = accessToken;
		this.scope = scope;
		this.tokenType = tokenType;
	}
}
