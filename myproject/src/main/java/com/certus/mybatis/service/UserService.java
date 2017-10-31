package com.certus.mybatis.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.certus.mybatis.entity.User;
import com.certus.mybatis.mapper.UserMapper;

@Service
public class UserService {

	@Resource
	private UserMapper userMapper;

	public String findUserById(int id) {
		return userMapper.findUserById(id);
	}

	public void updateUserInfo(User user) {
		userMapper.updateUserInfo(user);
	}
}
