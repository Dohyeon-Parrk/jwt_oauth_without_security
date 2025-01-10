package com.sparta.jwtoauthwithoutsecurity.oauth2.config;

import java.util.HashMap;
import java.util.Map;

import com.sparta.jwtoauthwithoutsecurity.oauth2.provider.OauthProvider;

// OauthProvider 를 저장하는 저장소
public class InMemoryProviderRepository {
	private final Map<String, OauthProvider> providers;

	public InMemoryProviderRepository(Map<String, OauthProvider> providers) {
		this.providers = new HashMap<>(providers);
	}

	public OauthProvider findByProviderName(String name) {
		return providers.get(name);
	}
}