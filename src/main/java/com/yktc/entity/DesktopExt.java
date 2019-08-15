package com.yktc.entity;

/**
 * @author Administrator
 * @Date: 2019/8/14
 * @Created with IntelliJ IDEA.
 * @Time: 22:55
 * @To change this template use File | Settings | File Templates.
 * @Description:
 */
public class DesktopExt extends Desktop{
	private String susername;
	private Integer scard;
	private String scord;

	public String getSusername() {
		return susername;
	}

	public void setSusername(String susername) {
		this.susername = susername;
	}

	public Integer getScard() {
		return scard;
	}

	public void setScard(Integer scard) {
		this.scard = scard;
	}

	public String getscord() {
		return scord;
	}

	public void setscord(String scord) {
		this.scord = scord;
	}
}
