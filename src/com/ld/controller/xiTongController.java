package com.ld.controller;

import java.io.PrintWriter;

import net.sf.json.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ld.dbPOJO.ShJiankao;
import com.ld.dbPOJO.ShSchool;
import com.ld.dbPOJO.ShTeacher;
import com.ld.services.XiTongService;

/** 
 * @Version:V6.0
 */
@Controller
public class xiTongController {

	//主考管理===============================================
	
	/**
	 * 获取主考列表
	 * @param out
	 * @return json数组
	 */
	@RequestMapping(value = "getZhuKao", method=RequestMethod.POST)
	public void addZhuKao(PrintWriter out){
		String userLiString = "" ;   
		//TODO 获取用户信息列表
		userLiString = XiTongService.getZhuKao();
		out.write(userLiString);
	}
	
	/**
	 * 新建主考
	 * @param params 
	 * @param out
	 */
	@RequestMapping(value = "addZhuKao", method=RequestMethod.POST)
	public void addZhuKao(String name,String pwd,String truename,
			String sex,String tel,String school,String words,PrintWriter out){
		boolean success = false;//是否执行成功
		ShTeacher shTeacher = new ShTeacher();
		//TODO 参数设置进实体类
		shTeacher.setUserName(name);
		shTeacher.setPassword(pwd);
		shTeacher.setTeacherName(truename);
		shTeacher.setTeacherSex(sex);
		shTeacher.setTeacherTel(tel);
		shTeacher.setShooId(Integer.parseInt(school));
		shTeacher.setTeacherPower(words);
		success =  XiTongService.addZhuKao(shTeacher);
		out.write(String.valueOf(success));
	}
	
	/**
	 * 编辑主考
	 * @param params
	 * @param out
	 */
	@RequestMapping(value = "editZhuKao", method=RequestMethod.POST)
	public void editZhuKao(String params,PrintWriter out){
		boolean success = false;//是否执行成功
		ShTeacher shTeacher = new ShTeacher();
		//TODO 参数设置进实体类
		shTeacher.setUserName("");
		shTeacher.setPassword("");
		
		success =  XiTongService.editZhuKao(shTeacher);
		out.write(String.valueOf(success));
	}
	
	/**
	 * 删除主考
	 * @param params
	 * @param out
	 */
	@RequestMapping(value = "delZhuKao", method=RequestMethod.POST)
	public void delZhuKao(String params,PrintWriter out){
		boolean success = false;//是否执行成功
		ShTeacher shTeacher = new ShTeacher();
		//TODO 参数设置进实体类
		shTeacher.setUserName("");
		shTeacher.setPassword("");
		
		success =  XiTongService.delZhuKao(shTeacher);
		out.write(String.valueOf(success));
	}
	
	//监考管理=======================================
	
	/**
	 * 获取监考列表
	 * @param out
	 * @return json数组
	 */
	@RequestMapping(value = "getJianKao", method=RequestMethod.POST)
	public void getJianKao(PrintWriter out){
		String userLiString = "" ;   
		//TODO 获取用户信息列表
		userLiString = XiTongService.getJianKao();
		out.write(userLiString);
	}
	
	/**
	 * 新建监考
	 * @param params 监考信息 json格式
	 * @param out
	 */
	@RequestMapping(value = "addJianKao", method=RequestMethod.POST)
	public void addJianKao(String params,PrintWriter out){
		boolean success = false;//是否执行成功
		ShJiankao shJiankao = new ShJiankao();
		//TODO 参数设置进实体类
		shJiankao.setUserName("");
		shJiankao.setPassword("");
		
		success =  XiTongService.addJianKao(shJiankao);
		
		out.write(String.valueOf(success));
	}
	
	/**
	 * 编辑监考
	 * @param params
	 * @param out
	 */
	@RequestMapping(value = "editJianKao", method=RequestMethod.POST)
	public void editJianKao(String params,PrintWriter out){
		boolean success = false;//是否执行成功
		ShJiankao shJiankao = new ShJiankao();
		//TODO 参数设置进实体类
		shJiankao.setUserName("");
		shJiankao.setPassword("");
		
		success =  XiTongService.editJianKao(shJiankao);
		
		out.write(String.valueOf(success));
	}
	
	/**
	 * 删除监考
	 * @param params
	 * @param out
	 */
	@RequestMapping(value = "delJianKao", method=RequestMethod.POST)
	public void delJianKao(String params,PrintWriter out){
		boolean success = false;//是否执行成功
		ShJiankao shJiankao = new ShJiankao();
		//TODO 参数设置进实体类
		shJiankao.setUserName("");
		shJiankao.setPassword("");
		
		success =  XiTongService.delJianKao(shJiankao);
		out.write(String.valueOf(success));
	}
	
	//账号管理====================================
	/**
	 * 图片上传
	 * @param params
	 * @param out
	 */
	@RequestMapping(value = "uploadImg", method=RequestMethod.POST)
	public void uploadImg(String params,PrintWriter out){
		boolean success = false;//是否执行成功
		//TODO 获取参数执行数据处理
		
		out.write(String.valueOf(success));
	}
	
	/**
	 * 获取用户信息（可以从session中获取）
	 * @param params
	 * @param out
	 */
	@RequestMapping(value = "getUserInfo", method=RequestMethod.POST)
	public void getUserInfo(String params,PrintWriter out){
		String userInfo = "";//用户信息
		//TODO 从数据库获取用户信息
		
		out.write(userInfo);
	}
	
	/**
	 * 编辑用户信息
	 * @param params
	 * @param out
	 */
	@RequestMapping(value = "editUserInfo", method=RequestMethod.POST)
	public void editUserInfo(String params,PrintWriter out){
		boolean success = false;//是否执行成功
		
		out.write(String.valueOf(success));
	}
	
	//学校管理===================================
	
	/**
	 * 获取学校列表
	 * @param out
	 * @return json数组
	 */
	@RequestMapping(value = "getXueXiao", method=RequestMethod.POST)
	public void getXueXiao(PrintWriter out){
		String schoolLiString = "" ;   
		//TODO 获取用户信息列表
		schoolLiString = XiTongService.getXueXiao();
		out.write(schoolLiString);
	}
	
	/**
	 * 新建学校
	 * @param params 学校信息 json格式
	 * @param out
	 */
	@RequestMapping(value = "addXueXiao", method=RequestMethod.POST)
	public void addXueXiao(String params,PrintWriter out){
		boolean success = false;//是否执行成功
		ShSchool shSchool = new ShSchool();
		//TODO 参数设置进实体类
		shSchool.setSchoolName("");
		
		success = XiTongService.addXueXiao(shSchool);
		out.write(String.valueOf(success));
	}
	
	/**
	 * 编辑学校
	 * @param params
	 * @param out
	 */
	@RequestMapping(value = "editXueXiao", method=RequestMethod.POST)
	public void editXueXiao(String params,PrintWriter out){
		boolean success = false;//是否执行成功
		ShSchool shSchool = new ShSchool();
		//TODO 参数设置进实体类
		shSchool.setSchoolName("");
		
		success = XiTongService.editXueXiao(shSchool);
		
		out.write(String.valueOf(success));
	}
	
	/**
	 * 删除学校
	 * @param params
	 * @param out
	 */
	@RequestMapping(value = "delXueXiao", method=RequestMethod.POST)
	public void delXueXiao(String params,PrintWriter out){
		boolean success = false;//是否执行成功
		ShSchool shSchool = new ShSchool();
		//TODO 参数设置进实体类
		shSchool.setSchoolName("");
		
		success = XiTongService.delXueXiao(shSchool);
		
		out.write(String.valueOf(success));
	}
}
