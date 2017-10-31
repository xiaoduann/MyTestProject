package com.certus.mybatis.mapper;

import com.certus.mybatis.entity.User;

public interface UserMapper {

	String findUserById(int id);

	void updateUserInfo(User user);

}