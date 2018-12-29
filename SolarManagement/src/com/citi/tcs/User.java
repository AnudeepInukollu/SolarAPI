package com.citi.tcs;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String profession;
	private long annualIncome;
	private int yearOfStay;
	

	public User() {
	}

	public User(int id, String name, String profession, long annualIncome, int yearOfStay ) {
		this.id = id;
		this.name = name;
		this.profession = profession;
	}

	public int getId() {
		return id;
	}

	@XmlElement
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}

	@XmlElement
	public void setProfession(String profession) {
		this.profession = profession;
	}

	public long getAnnualIncome() {
		return annualIncome;
	}

	@XmlElement
	public void setAnnualIncome(long annualIncome) {
		this.annualIncome = annualIncome;
	}

	public int getYearOfStay() {
		return yearOfStay;
	}

	@XmlElement
	public void setYearOfStay(int yearOfStay) {
		this.yearOfStay = yearOfStay;
	}
}
