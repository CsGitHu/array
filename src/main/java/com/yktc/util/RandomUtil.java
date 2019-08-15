package com.yktc.util;

/**
 * @author Administrator
 * @Date: 2019/8/14
 * @Created with IntelliJ IDEA.
 * @Time: 15:17
 * @To change this template use File | Settings | File Templates.
 * @Description:
 */
public class RandomUtil {
	public String  number(){
		String randomCode = "";
		// 用字符数组的方式随机
		String model = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] m = model.toCharArray();
		for (int j = 0; j < 5; j++) {
			char c = m[(int) (Math.random() * 36)];
			// 保证六位随机数之间没有重复的
			if (randomCode.contains(String.valueOf(c))) {
				j--;
				continue;
			}
			randomCode = randomCode + c;
		}
		return randomCode;
	}

}
