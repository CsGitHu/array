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



	@RequestMapping("/getDesktopByNoState")
	public Map<String,Object> getDesktopByNoState(Integer page,Integer rows){
		PageInfo<DesktopExt> pageInfo = desktopService.getDesktopByState(page,rows, 0);
		Map<String,Object> map=new HashMap<>();
		map.put("total",pageInfo.getTotal());
		map.put("rows",pageInfo.getList());
		return map;
	}

	//添加
	@RequestMapping("/saveDesktop")
	public String saveDesktop(Desktop desktop){
		int i = desktopService.saveDesktop(desktop);
		return "{\"result\":" + i + "}";
	}


	//删除多条
	@RequestMapping("/deleteDesktop")
	public String deleteDesktop(Integer [] ids){
		int i = desktopService.deleteDesktop(ids);
		System.out.println("i = " + i);
		return "{\"result\":" + i + "}";
	}






	//修改
	@RequestMapping("/updateDesktop")
	public String updateDesktop(Desktop desktop){
		int i = desktopService.updateByPrimaryKeySelective(desktop);
		System.out.println("i = " + i);
		return "{\"result\":" + i + "}";
	}

}
