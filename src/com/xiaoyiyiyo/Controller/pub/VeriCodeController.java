package com.xiaoyiyiyo.Controller.pub;

import java.io.ByteArrayOutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/code")
public class VeriCodeController {
	
	@RequestMapping
	public void getVeriCode(HttpServletResponse response){
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
	}
	
	private String drawImg(ByteArrayOutputStream output){
		return null;
	}
}
