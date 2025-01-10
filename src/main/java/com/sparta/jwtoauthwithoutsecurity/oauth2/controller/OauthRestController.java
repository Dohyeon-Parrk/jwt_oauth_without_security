package com.sparta.jwtoauthwithoutsecurity.oauth2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sparta.jwtoauthwithoutsecurity.oauth2.controller.dto.LoginResponse;
import com.sparta.jwtoauthwithoutsecurity.oauth2.service.OauthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class OauthRestController {

	private final OauthService oauthService;

	@GetMapping("/login/oauth/{provider}")
	public ResponseEntity<LoginResponse> login(@PathVariable String provider, @RequestParam String code){
		LoginResponse loginResponse = oauthService.login(provider, code);
		return ResponseEntity
			.ok()
			.body(loginResponse);
	}
}
