package com.yktc.mapper;

import com.yktc.entity.Desktop;
import com.yktc.entity.DesktopExample;
import com.yktc.entity.DesktopExt;

import java.util.List;

public interface DesktopMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Desktop record);

    int insertSelective(Desktop record);

    List<Desktop> selectByExample(DesktopExample example);

    Desktop selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Desktop record);

    int updateByPrimaryKey(Desktop record);

    int deleteDesktop(Integer[] ids);

    List<DesktopExt> getDesktopByState(Integer state);
}