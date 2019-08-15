package com.yktc.controller;

import com.github.pagehelper.PageInfo;
import com.yktc.entity.Desktop;
import com.yktc.entity.DesktopExt;
import com.yktc.service.DesktopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @Date: 2019/8/13
 * @Created with IntelliJ IDEA.
 * @Time: 15:38
 * @To change this template use File | Settings | File Templates.
 * @Description:
 */
@RestController
public class DesktopController {
	@Autowired
	private DesktopService desktopService;


	//未审核
	@RequestMapping("/getDesktopByNoState")
	public Map<String,Object> getDesktopByNoState(Integer page,Integer rows){
		PageInfo<DesktopExt> pageInfo = desktopService.getDesktopByState(page,rows, 0);
		Map<String,Object> map=new HashMap<>();
		map.put("total",pageInfo.getTotal());
		map.put("rows",pageInfo.getList());
		return map;
	}

	//已审核
	@RequestMapping("/getDesktopByYesState")
	public Map<String,Object> getDesktopByYesState(Integer page,Integer rows){
		PageInfo<DesktopExt> pageInfo = desktopService.getDesktopByState(page,rows, 1);
		Map<String,Object> map=new HashMap<>();
		map.put("total",pageInfo.getTotal());
		map.put("rows",pageInfo.getList());
		return map;
	}

	//通过审核
	@RequestMapping("/passDesktop")
	public Map<String,Object> passDesktop(Integer id){
		int i = desktopService.passDesktop(id); //0就是未审核
		Map<String,Object> map=new HashMap<>();
		map.put("result",i);
		return map;
	}
}
