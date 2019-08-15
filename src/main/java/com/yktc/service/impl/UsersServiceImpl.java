package com.yktc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yktc.entity.Users;
import com.yktc.entity.UsersCondition;
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
	public PageInfo<Users> selectPageAll(UsersCondition Condition) {
		PageHelper.startPage(Condition.getPage(),Condition.getRows());
		UsersExample usersExample=new UsersExample();
		UsersExample.Criteria criteria = usersExample.createCriteria();
		criteria.andIsadminEqualTo(0);// 1 表示管理员
		//添加查询条件
		if(Condition.getUsername() !=null){
			criteria.andUsernameLike(Condition.getUsername());
		}
		if(Condition.getCode() !=null){
			criteria.andCodeLike("%"+Condition.getCode()+"%");
		}
		List<Users> usersList = usersMapper.selectByExample(usersExample);
		return new PageInfo<>(usersList);
	}
}
