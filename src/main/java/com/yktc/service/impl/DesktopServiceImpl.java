package com.yktc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yktc.entity.Desktop;
import com.yktc.entity.DesktopExt;
import com.yktc.mapper.DesktopMapper;
import com.yktc.service.DesktopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @author Administrator
 * @Date: 2019/8/13
 * @Created with IntelliJ IDEA.
 * @Time: 15:35
 * @To change this template use File | Settings | File Templates.
 * @Description:
 */

@Service
public class DesktopServiceImpl implements DesktopService {
	@Autowired
	private      DesktopMapper desktopMapper;


	@Override
	@Transactional
	public int saveDesktop(Desktop desktop) {

		return desktopMapper.insertSelective(desktop);
	}

	@Override
	public int deleteDesktop(Integer[] ids) {
		return 0;
	}


	@Transactional
	@Override
	public int updateByPrimaryKeySelective(Desktop record) {
		return desktopMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public PageInfo<DesktopExt> getDesktopByState(Integer page,Integer rows, Integer ispass) {
		PageHelper.startPage(page,rows);
		List<DesktopExt> list = desktopMapper.getDesktopByState(ispass);
		return new PageInfo<>(list);
	}

	@Transactional
	@Override
	public int passDesktop(Integer id) {
		DesktopExt desktopExt=new DesktopExt();
		desktopExt.setId(id);
		desktopExt.setIspass(1);//通过审核
		return desktopMapper.updateByPrimaryKeySelective(desktopExt);
	}
}
