package com.sparta.jwtoauthwithoutsecurity.oauth2.adapter;

import java.util.HashMap;
import java.util.Map;

import com.sparta.jwtoauthwithoutsecurity.oauth2.config.OauthProperties;
import com.sparta.jwtoauthwithoutsecurity.oauth2.provider.OauthProvider;

// OauthProperties 를 OauthProvider 로 바꿔준다.
public class OauthAdapter {

	private OauthAdapter(){

	}

	// OauthProperties 를 OauthProvider 로 변환해준다.
	public static Map<String, OauthProvider> getOauthProviders(OauthProperties properties) {
		Map<String, OauthProvider> oauthProvider = new HashMap<>();

		properties.getUser().forEach((key, value) -> oauthProvider.put(key,
			new OauthProvider(value, properties.getProvider().get(key))));
		return oauthProvider;
	}
}
