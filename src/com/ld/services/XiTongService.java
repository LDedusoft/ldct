package com.ld.services;

import java.io.Writer;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.jms.Session;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.ld.controller.mainController;
import com.ld.dbPOJO.ShJiankao;
import com.ld.dbPOJO.ShTeacher;
import com.ld.dbPOJO.TbAdmins;
import com.ld.dbPOJO.TeacherUserInfo;
import com.ld.utils.ConnManager;
import com.ld.utils.MD5Util;

public class XiTongService {
	
	/**
	 * 获取主考列表
	 * @return
	 */
	public static String getZhuKao(){
		Connection conn = null;
		String sql = "SELECT * FROM SH_Teacher";
		JSONArray  userArray  = new JSONArray() ;//主考信息   
		List<ShTeacher> list = null;
		try {
			conn =  ConnManager.getConn();
			//TODO 数据库获取用户信息
			list =new QueryRunner().query(conn, sql, new BeanListHandler<ShTeacher>(ShTeacher.class)); 
			userArray = JSONArray.fromObject(list);  //list转json数组
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			ConnManager.closeConn(conn); //关闭数据库connection
		}
		return userArray.toString();
	}
	
	/**
	 * 增加主考
	 * @param param
	 * @return
	 */
	public static boolean addZhuKao(String param){
		boolean success = false;
		
		 final String SQL = "insert into **** VALUES(?,?,?,?)";  
		    Connection conn = null;
		    try {  
		    	JSONObject userInfo = JSONObject.fromObject(param);
		        conn = ConnManager.getConn();  
		        int result = new QueryRunner().update(conn, SQL, new Object[] {userInfo.get("name"),userInfo.get("name"),userInfo.get("name"),userInfo.get("name")});  
		        if (0 < result){
		        	success = true;
		        } 
		    } catch (Exception e) {  
		        e.printStackTrace();  
		    } finally {  
		    	ConnManager.closeConn(conn);  
		    }  
		return success;
	}
	
	/**
	 * 编辑主考
	 * @param param
	 * @return
	 */
	public static boolean editZhuKao(String param){
		boolean success = false;
		//TODO 执行数据处理
		
		return success;
	}
	
	/**
	 * 删除主考
	 * @param param
	 * @return
	 */
	public static boolean delZhuKao(String param){
		boolean success = false;
		//TODO 执行数据处理
		
		return success;
	}
	
	
	
	
	
	public static void main(String[] args) {
		ShTeacher shTeacher = new ShTeacher();
		shTeacher.setUserName("aa");
		shTeacher.setPassword("123");
		shTeacher.setShooId("33333");
		ShTeacher shTeacher2 = new ShTeacher();
		shTeacher2.setUserName("hhhhh");
		shTeacher2.setPassword("password");
		shTeacher2.setShooId("sssss");
		List<ShTeacher> list = new ArrayList<ShTeacher>();
		list.add(shTeacher);
		list.add(shTeacher2);
		JSONArray uArray = new JSONArray();
		uArray = JSONArray.fromObject(list);
		System.out.println(uArray.toString());
		
	}
}
