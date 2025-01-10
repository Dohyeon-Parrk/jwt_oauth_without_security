package com.sparta.jwtoauthwithoutsecurity.oauth2.config;

import java.util.Map;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sparta.jwtoauthwithoutsecurity.oauth2.adapter.OauthAdapter;
import com.sparta.jwtoauthwithoutsecurity.oauth2.provider.OauthProvider;

// OauthProperties 에서 바인딩 상태로 만들고 사용하기 위한 설정 파일
@Configuration
@EnableConfigurationProperties(OauthProperties.class)
public class OauthConfig {

	private final OauthProperties properties;

	public OauthConfig(OauthProperties properties) {
		this.properties = properties;
	}

	// OauthAdapter 를 사용하여 각 OAuth 서버 정보를 가진 OauthProvider 로 분해하여 InMemoryProviderRepository 에 저장
	@Bean
	public InMemoryProviderRepository inMemoryProviderRepository(){
		Map<String, OauthProvider> providers = OauthAdapter.getOauthProviders(properties);
		return new InMemoryProviderRepository(providers);
	}
}
