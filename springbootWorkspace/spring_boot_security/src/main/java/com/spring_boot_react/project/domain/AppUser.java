package com.spring_boot_react.project.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

// jpa 기능 활용해서 db에 테이블 자동 생성되도록 설정
@Entity
@SequenceGenerator(
		name="MEMBER_SEQUENCE_GENERATOR",
		sequenceName="MEMBER_SEQUENCE")
public class AppUser {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="MEMBER_SEQUENCE_GENERATOR")
	@Column(nullable=false, updatable=false)
	private Long id; // 이건 자동으로 생성 & 수정 불가 & 기본키
	
	@Column(nullable=false, unique=true)
	private String username; // 유일해야함
	
	@Column(nullable=false)
	private String password;
	
	@Column(nullable=false)
	private String role;
	
	public AppUser() {
		
	}
	
	public AppUser(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
