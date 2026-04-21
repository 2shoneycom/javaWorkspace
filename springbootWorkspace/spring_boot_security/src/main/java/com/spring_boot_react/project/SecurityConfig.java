package com.spring_boot_react.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.spring_boot_react.project.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	// 인메모리 계정인 user 계정 수정 (암호 변경)
//	@Bean
//	public InMemoryUserDetailsManager userDetailService() {
//		UserDetails user = User.builder()
//							.username("user")
//							.password(passwordEncoder().encode("password"))
//							.roles("USER")
//							.build();
//		
//		return new InMemoryUserDetailsManager(user); // 스프링 시큐리티 설정 반환
//	}
	
	// DB 사용자 계정 이용한 스프링 시큐리티 구성 - 사용자 계정 시큐리에 연결
	private final UserDetailsServiceImpl userDetailsService;
	// private final AuthenticationFilter authenticationFilter;
    // private final AuthEntryPoint exceptHandler;
	
	public SecurityConfig(UserDetailsServiceImpl userDetailsService) {
		this.userDetailsService = userDetailsService;
	}
	
	// DB 사용자 설정
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf((csrf)->csrf.disable())
			.sessionManagement(
					(sessionManagement)->sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
					)
			.authorizeHttpRequests(
					(authorizeHttpRequests)->authorizeHttpRequests.requestMatchers(HttpMethod.POST, "/login")
					.permitAll().anyRequest().authenticated()
					); // 모든 요청에 대해 /login을 선행할 것 -> 클라이언트가 jwt 토큰이 없으면 로그인을 요구하게 됨
			
		return http.build();
	}
	
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
	  return authConfig.getAuthenticationManager();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
