package com.yktc.mapper;

import com.yktc.entity.Oeders;
import com.yktc.entity.OedersExample;
import java.util.List;

public interface OedersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Oeders record);

    int insertSelective(Oeders record);

    List<Oeders> selectByExample(OedersExample example);

    Oeders selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Oeders record);

    int updateByPrimaryKey(Oeders record);
}