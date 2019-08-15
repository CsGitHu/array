package com.yktc.controller;

import com.github.pagehelper.PageInfo;
import com.yktc.entity.Users;
import com.yktc.entity.UsersCondition;
import com.yktc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	@RequestMapping("/selectPageAll")
	public Map<String, Object> selectPageAll(UsersCondition condition){
		PageInfo<Users> pageInfo = usersService.selectPageAll(condition);
		Map<String,Object> map=new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());
		return map;
	}


}
