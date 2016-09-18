package com.ld.dbPOJO;

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
	private String TypeName1="" ;
	private String  TypeName2="";
	private String  Creater="";
	private String  cType="";
	private String  CreateTime="";
	private String  remark="";
	private String  score1="";
	private String  State="";
	private String  score2="";
	private String  score="";
	private String  Name="";
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
	public String getcType() {
		return cType;
	}
	public void setcType(String cType) {
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
	public String getScore1() {
		return score1;
	}
	public void setScore1(String score1) {
		this.score1 = score1;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getScore2() {
		return score2;
	}
	public void setScore2(String score2) {
		this.score2 = score2;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
}
