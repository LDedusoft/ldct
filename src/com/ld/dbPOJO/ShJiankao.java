package com.ld.dbPOJO;

/**
 * 监考
 * @author wjw
 *CREATE TABLE SH_JianKao(
	KaoguanID INT NOT NULL PRIMARY KEY,
	UserName nvarchar(50) NULL,
	PassWord nvarchar(50) NULL,
	TeacherName varchar(50) NULL,
	TeacherSex varchar(10) NULL,
	TeacherTel varchar(50) NULL,
	TeacherMobile varchar(50) NULL,
	TeacherPower nvarchar(500) NULL,
	ShoolId int NULL,
	HeadImage nvarchar(255) NULL
);
 */
public class ShJiankao {
	private int kaoguanID;
	private String userName="";
	private String password="";;
	private String teacherName="";
	private String teacherSex="";
	private String teacherTel="";
	private String teacherMobile="";
	private String teacherPower="";
	private int shooId=0;
	private String headImage="";

	
	public int getKaoguanID() {
		return kaoguanID;
	}
	public void setKaoguanID(int kaoguanID) {
		this.kaoguanID = kaoguanID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherSex() {
		return teacherSex;
	}
	public void setTeacherSex(String teacherSex) {
		this.teacherSex = teacherSex;
	}
	public String getTeacherTel() {
		return teacherTel;
	}
	public void setTeacherTel(String teacherTel) {
		this.teacherTel = teacherTel;
	}
	public String getTeacherMobile() {
		return teacherMobile;
	}
	public void setTeacherMobile(String teacherMobile) {
		this.teacherMobile = teacherMobile;
	}
	public String getTeacherPower() {
		return teacherPower;
	}
	public void setTeacherPower(String teacherPower) {
		this.teacherPower = teacherPower;
	}
	public int getShooId() {
		return shooId;
	}
	public void setShooId(int shooId) {
		this.shooId = shooId;
	}
	public String getHeadImage() {
		return headImage;
	}
	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}
}
