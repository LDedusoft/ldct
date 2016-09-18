package com.ld.dbPOJO;

import java.math.BigDecimal;

/**
 * 试题
 * @author wjw
 *CREATE TABLE SH_Subject
(
ID INT NOT NULL PRIMARY KEY,
TypeName1 nvarchar(20) NULL,
	TypeName2 nvarchar(200) NULL,
	Creater nvarchar(50) NULL,
	cType int NULL,
	CreateTime datetime NULL,
	remark nvarchar(50) NULL,
	score1 decimal(18, 2) NULL,
	State nvarchar(50) NULL,
	score2 decimal(18, 2) NULL,
	score decimal(18, 2) NULL,
	Name nvarchar(50) NULL
);
 */
public class ShSubject {
	private int id;
	private String TypeName1="";
	private String  TypeName2="";
	private String  Creater="";
	private int  cType=0;
	private String  CreateTime="";
	private String  remark="";
	private float  score1=0;
	private String  State="";
	private float  score2=0;
	private float  score=0;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeName1() {
		return TypeName1;
	}
	public void setTypeName1(String typeName1) {
		TypeName1 = typeName1;
	}
	public String getTypeName2() {
		return TypeName2;
	}
	public void setTypeName2(String typeName2) {
		TypeName2 = typeName2;
	}
	public String getCreater() {
		return Creater;
	}
	public void setCreater(String creater) {
		Creater = creater;
	}
	public int getcType() {
		return cType;
	}
	public void setcType(int cType) {
		this.cType = cType;
	}
	public String getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public float getScore1() {
		return score1;
	}
	public void setScore1(float score1) {
		this.score1 = score1;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public float getScore2() {
		return score2;
	}
	public void setScore2(float score2) {
		this.score2 = score2;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	private String  Name="";
	
	public static void main(String[] args) {
		BigDecimal price =new BigDecimal("1.03");
		BigDecimal price1 =new BigDecimal("0.42");
		System.out.println(price.subtract(price1).doubleValue());
	}
	
}
