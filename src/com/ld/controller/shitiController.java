package com.ld.controller;

import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** 
 * @Version:V6.0
 */
@Controller
public class shitiController {

	
	@RequestMapping(value = "getShiTi", method=RequestMethod.POST)
	public void dsggetShiTi(String userName,PrintWriter out){
		
		String a="[";
		for (int i = 0; i < 28; i++) {
			String item = "{\"inv\":\""+userName+i+i+"\",\"date\":\""+(1+Math.random()*(10-1+1))+"\"," +
			"\"name\":\"name\",\"amount\":\"amount\"," +
			"\"price\":\"price\",\"cost\":\"cost\",\"note\":\"note\",\"out\":\"out\"}";
			a+=item+",";
		}
		a = a.substring(0,a.length()-1);
		a+="]";
		out.write(a);
	}
	
	@RequestMapping(value = "searchShiTi", method=RequestMethod.POST)
	public void dsggetShiTi(String userName,String stType,PrintWriter out){
		
		String a="[";
		for (int i = 0; i < 28; i++) {
			String item = "{\"inv\":\""+userName+i+i+"\",\"date\":\""+(1+Math.random()*(10-1+1))+"\"," +
			"\"name\":\""+stType+"\",\"amount\":\"amount\"," +
			"\"price\":\"price\",\"cost\":\"cost\",\"note\":\"note\",\"out\":\"out\"}";
			a+=item+",";
		}
		a = a.substring(0,a.length()-1);
		a+="]";
		out.write(a);
	}
	
	@RequestMapping(value = "addNewShiTi", method=RequestMethod.POST)
	public void dsg_addNewShiTi(String stName,String stType,String clType,PrintWriter out){
		String b="ttt";
		String a="--多大的-提交数据："+stName+"--"+stType+"--"+clType;
		out.write(a);
	}
}
