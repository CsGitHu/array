package com.yktc.service;

import com.github.pagehelper.PageInfo;
import com.yktc.entity.Desktop;
import com.yktc.entity.DesktopExt;


/**
 * @author Administrator
 * @Date: 2019/8/13
 * @Created with IntelliJ IDEA.
 * @Time: 15:34
 * @To change this template use File | Settings | File Templates.
 * @Description:
 */
public interface DesktopService {
	//未审核
	PageInfo<DesktopExt> getDesktopByState(Integer page,Integer rows,Integer ispass);

	//审核
	int passDesktop(Integer id);
}
