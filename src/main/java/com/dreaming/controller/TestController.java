package com.dreaming.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dreaming.exception.BaseException;
import com.dreaming.vo.Result;

@Controller
public class TestController {
	
	@RequestMapping(value = "test2",method=RequestMethod.GET)
	@ResponseBody
	public Result<Long> test2() throws BaseException{
		int num = 0;
		Date now = null;
		if(num < 1) {
			 now = new Date();
			throw new BaseException(1,"失败");
		}
		return new Result<Long>(true, now.getTime());
	}
	
}
