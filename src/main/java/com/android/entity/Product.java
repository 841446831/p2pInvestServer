package com.android.entity;

public class Product {
 
	private Integer id;
	private String name; //名称
	private String title;  //副标题
	private Double annualRate;  //年利率
	private String timeLimit;  //期限
	private Integer investMoney;  //
	private Integer startTime;  //起息时间
	private Integer total;   //项目金额
	private Integer startMoney; //起购金额
	private Integer peopleNum;  //购买人数
	private String introduce;  //产品简介
	private int tid;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getAnnualRate() {
		return annualRate;
	}
	public void setAnnualRate(Double annualRate) {
		this.annualRate = annualRate;
	}
	public String getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(String timeLimit) {
		this.timeLimit = timeLimit;
	}
	public Integer getInvestMoney() {
		return investMoney;
	}
	public void setInvestMoney(Integer investMoney) {
		this.investMoney = investMoney;
	}
	public Integer getStartTime() {
		return startTime;
	}
	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getStartMoney() {
		return startMoney;
	}
	public void setStartMoney(Integer startMoney) {
		this.startMoney = startMoney;
	}
	public Integer getPeopleNum() {
		return peopleNum;
	}
	public void setPeopleNum(Integer peopleNum) {
		this.peopleNum = peopleNum;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", title=" + title
				+ ", annualRate=" + annualRate + ", timeLimit=" + timeLimit
				+ ", investMoney=" + investMoney + ", startTime=" + startTime
				+ ", total=" + total + ", startMoney=" + startMoney
				+ ", peopleNum=" + peopleNum + ", introduce=" + introduce
				+ ", tid=" + tid + "]";
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	
	
}
