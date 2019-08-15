package com.yktc.service;

import com.github.pagehelper.PageInfo;
import com.yktc.entity.Users;
import com.yktc.entity.UsersCondition;

public interface UsersService {
	PageInfo<Users> selectPageAll(UsersCondition usersCondition);
}
