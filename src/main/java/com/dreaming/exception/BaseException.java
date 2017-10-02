package com.dreaming.exception;


/**
 * 基础异常类继承自RuntimeException异常
 * @author Fox
 *
 */
public class BaseException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	
	
	private int status;
	
	private String msg;
	
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public BaseException(String message, Throwable cause) {
		super(message, cause);
	}

	public BaseException(String message) {
		super(message);
	}

	public BaseException(int status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}

}
