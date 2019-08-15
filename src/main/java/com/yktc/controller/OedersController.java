package com.yktc.controller;

import com.yktc.entity.Oeders;
import com.yktc.service.OedersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @Date: 2019/8/12
 * @Created with IntelliJ IDEA.
 * @Time: 18:09
 * @To change this template use File | Settings | File Templates.
 * @Description:
 */
@RestController
public class OedersController {
	@Autowired
	private OedersService oedersService;


	@RequestMapping("saveOeder")
	public String saveOeder(Oeders oeders){
		int insert = oedersService.insertSelective(oeders);
		return "{\"result\":" + insert + "}";
	}
}
