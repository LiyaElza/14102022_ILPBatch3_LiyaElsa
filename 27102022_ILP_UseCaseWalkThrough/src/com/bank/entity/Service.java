package com.bank.entity;

import java.util.Date;

public class Service {
	
	private String serviceCode;
	private String serviceName;
	private String seviceDesc;
	private Date openDate;
	private Date validityDate;
	private Date expiryDate;
	private Rate rate;
	
	public Service(String serviceCode, String serviceName, String seviceDesc, Date openDate, Date validityDate,
			Date expiryDate) {
		super();
		this.serviceCode = serviceCode;
		this.serviceName = serviceName;
		this.seviceDesc = seviceDesc;
		this.openDate = openDate;
		this.validityDate = validityDate;
		this.expiryDate = expiryDate;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getSeviceDesc() {
		return seviceDesc;
	}

	public void setSeviceDesc(String seviceDesc) {
		this.seviceDesc = seviceDesc;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public Date getValidityDate() {
		return validityDate;
	}

	public void setValidityDate(Date validityDate) {
		this.validityDate = validityDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Rate getRate() {
		return rate;
	}

	public void setRate(Rate rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Service [serviceCode=" + serviceCode + ", serviceName=" + serviceName + ", seviceDesc=" + seviceDesc
				+ ", openDate=" + openDate + ", validityDate=" + validityDate + ", expiryDate=" + expiryDate + "]";
	}
	
	

}
