package com.yktc.mapper;

import com.github.pagehelper.PageInfo;
import com.yktc.entity.Users;
import com.yktc.entity.UsersCondition;
import com.yktc.entity.UsersExample;
import java.util.List;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);


    PageInfo<Users> selectPageAll(UsersCondition usersCondition);

    int deleteUsers(Integer[] ids);
}