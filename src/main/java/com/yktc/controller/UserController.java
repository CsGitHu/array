package com.yktc.controller;

import com.yktc.entity.Users;
import com.yktc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 * @Date: 2019/8/12
 * @Created with IntelliJ IDEA.
 * @Time: 9:58
 * @To change this template use File | Settings | File Templates.
 * @Description:
 */
@RestController
public class UserController {
	@Autowired
	private UsersService usersService;

	@RequestMapping("getAll")
	public List<Users> getAll(){
		return usersService.getUsersAll();
	}

}
