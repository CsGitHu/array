package com.yktc.util;

import java.util.Random;

/**
 * @author Administrator
 * @Date: 2019/8/12
 * @Created with IntelliJ IDEA.
 * @Time: 15:45
 * @To change this template use File | Settings | File Templates.
 * @Description:
 */
public class number {
	public static void main(String[] args) {
		Random random = new Random();
		int nextInt = random.nextInt();
		String str = String.valueOf(nextInt).replace("-", "").substring(0, 5);
		System.out.println(str);
	}
}
