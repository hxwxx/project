package com.project.domain;

import lombok.Data;

@Data
public class UserVO {
	private String id;
	private String pwd;
	private String name;
	private String mail;
	private String phone;
	private String status;
}
