package com.yktc.service.impl;

import com.yktc.entity.Oeders;
import com.yktc.mapper.OedersMapper;
import com.yktc.service.OedersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

/**
 * @author Administrator
 * @Date: 2019/8/12
 * @Created with IntelliJ IDEA.
 * @Time: 18:07
 * @To change this template use File | Settings | File Templates.
 * @Description:
 */
@Service
public class OedersServiceImpl implements OedersService {
	@Autowired
	private OedersMapper oedersMapper;
	@Override
	public int insert(Oeders record) {
		return oedersMapper.insert(record);
	}

	@Override
	public int insertSelective(Oeders record) {
		/*Random random = new Random();
		int nextInt = random.nextInt();
		String str = String.valueOf(nextInt).replace("-", "").substring(0, 5);
		record.setCode(str);*/
		return oedersMapper.insertSelective(record);
	}

}
