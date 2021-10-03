package com.addtwo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class testController {

	@RequestMapping("/test")
	public String handler()
	{
		return "This will return you the desired result";
	}
}
