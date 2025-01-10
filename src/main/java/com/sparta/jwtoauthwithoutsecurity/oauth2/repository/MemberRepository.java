package com.sparta.jwtoauthwithoutsecurity.oauth2.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sparta.jwtoauthwithoutsecurity.oauth2.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
	Optional<Member> findByOauthId(String id);
}
