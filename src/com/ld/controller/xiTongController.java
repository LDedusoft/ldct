package com.ld.controller;

import java.io.PrintWriter;

import net.sf.json.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	 * @param params 主考信息 json格式
	 * @param out
	 */
	@RequestMapping(value = "addZhuKao", method=RequestMethod.POST)
	public void addZhuKao(String params,PrintWriter out){
		boolean success = false;//是否执行成功
		//TODO 获取参数执行数据处理
		success =  XiTongService.addZhuKao(params);
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
		//TODO 获取参数执行数据处理
		success =  XiTongService.editZhuKao(params);
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
		//TODO 获取参数执行数据处理
		success =  XiTongService.delZhuKao(params);
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
		JSONArray  userArray  = new JSONArray() ;//主考信息   
		//TODO 从数据库获取用户信息列表
		
		out.write(userArray.toString());
	}
	
	/**
	 * 新建监考
	 * @param params 监考信息 json格式
	 * @param out
	 */
	@RequestMapping(value = "addJianKao", method=RequestMethod.POST)
	public void addJianKao(String params,PrintWriter out){
		boolean success = false;//是否执行成功
		//TODO 获取参数执行数据处理
		
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
		//TODO 获取参数执行数据处理
		
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
		//TODO 获取参数执行数据处理
		
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
		//TODO 获取参数执行数据处理
		
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
		JSONArray  userArray  = new JSONArray() ;//主考信息   
		//TODO 从数据库获取用户信息列表
		
		out.write(userArray.toString());
	}
	
	/**
	 * 新建学校
	 * @param params 学校信息 json格式
	 * @param out
	 */
	@RequestMapping(value = "addXueXiao", method=RequestMethod.POST)
	public void addXueXiao(String params,PrintWriter out){
		boolean success = false;//是否执行成功
		//TODO 获取参数执行数据处理
		
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
		//TODO 获取参数执行数据处理
		
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
		//TODO 获取参数执行数据处理
		
		out.write(String.valueOf(success));
	}
}
