package com.experion.entity;

public class Service {
	
	private String serviceCode;
	private String serviceName;
	public Service(String serviceCode, String serviceName) {
		
		this.serviceCode = serviceCode;
		this.serviceName = serviceName;
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
	
	
	
	

}
