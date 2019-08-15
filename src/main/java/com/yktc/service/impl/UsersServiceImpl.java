package com.yktc.service.impl;

import com.yktc.entity.Users;
import com.yktc.entity.UsersExample;
import com.yktc.mapper.UsersMapper;
import com.yktc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @Date: 2019/8/11
 * @Created with IntelliJ IDEA.
 * @Time: 21:53
 * @To change this template use File | Settings | File Templates.
 * @Description:
 */
@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersMapper usersMapper;

	@Override
	public List<Users> getUsersAll() {
		UsersExample usersExample=new UsersExample();
		UsersExample.Criteria criteria = usersExample.createCriteria();
		criteria.andIsAdminEqualTo(new Integer(0));//表示管理员
		List<Users> usersList = usersMapper.selectByExample(usersExample);
		return usersList;
	}
}
