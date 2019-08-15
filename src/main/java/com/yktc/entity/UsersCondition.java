package com.yktc.entity;

/**
 * @author Administrator
 * @Date: 2019/8/15
 * @Created with IntelliJ IDEA.
 * @Time: 15:29
 * @To change this template use File | Settings | File Templates.
 * @Description:
 */
public class UsersCondition {
	private  Integer page;
	private  Integer rows;

	private String username;
	private String code;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
