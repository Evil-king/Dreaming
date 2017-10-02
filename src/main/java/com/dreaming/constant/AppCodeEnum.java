package com.dreaming.constant;

/*
 * 所有自定义异常的枚举
 */
public enum AppCodeEnum {
	
	SUCCESS(0,"成功"),
	FAIL(1,"失败"),;
	
	private Integer status;
	
	private String msg;

	public Integer getStatus() {
		return status;
	}

	public String getMsg() {
		return msg;
	}

	private AppCodeEnum(Integer status, String msg) {
		this.status = status;
		this.msg = msg;
	}
	
	
}
