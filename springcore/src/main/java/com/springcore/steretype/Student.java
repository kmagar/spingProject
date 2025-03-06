package com.springcore.steretype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component 
@Scope("prototype")
public class Student {
	
	@Value("Kishor")
	private String studentName;
	
	@Value("pune")
	private String city;
	
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	@Value("#{temp}")
	private List<String> addresses;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
}
