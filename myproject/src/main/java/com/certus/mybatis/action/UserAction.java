package com.certus.mybatis.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.certus.mybatis.entity.User;
import com.certus.mybatis.service.UserService;

@Controller
@RequestMapping("/user")
public class UserAction {

	@Resource
	private UserService userService;

	@RequestMapping("/findUserById")
	public String findUserById(int id, Model model) {
		String username = userService.findUserById(id);
		if (username != null) {
			model.addAttribute("username", username);
		} else {
			model.addAttribute("username", "未找到");
		}
		return "test";
	}

	@RequestMapping("/updateUser")
	public String updateUserById(int id, String name, Model model) {
		User user = new User();
		user.setId(id);
		user.setUserame(name);
		userService.updateUserInfo(user);
		model.addAttribute("username", "OK");
		return "test";
	}

}