package com.tsunami.newsystem.dao;

import java.util.List;

import com.tsunami.newsystem.entity.Admin;

public interface AdminDAO {
	public List<Admin> search(Admin admin);
}
