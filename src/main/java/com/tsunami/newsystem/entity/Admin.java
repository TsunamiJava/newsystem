package com.tsunami.newsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;
	@Column(name = "LoginName")
	private String loginName;
	@Column(name = "LoginPwd")
	private String loginPwdString;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwdString() {
		return loginPwdString;
	}
	public void setLoginPwdString(String loginPwdString) {
		this.loginPwdString = loginPwdString;
	}
	
}
