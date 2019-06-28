package com.spring.hibernatestest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Students {

	@Id
	@Column(name = "admissionnumber")
	private Long admissionnumber;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "rollnumber")
	private String rollnumber;

	@Column(name = "class")
	private String class_name;

	@Column(name = "mathmarks")
	private Long mathmarks;

	@Column(name = "sciencemarks")
	private Long sciencemarks;

	@Column(name = "socialmarks")
	private Long socialmarks;

	@Column(name = "physicsmarks")
	private Long physicsmarks;

	@Column(name = "totalmarks")
	private Long totalmarks;

	@Column(name = "averagemarks")
	private Double averagemarks;

	public Students() {
		super();
	}

	public Students(Long admissionnumber, String firstname, String lastname, String rollnumber, String class_name,
			Long mathmarks, Long sciencemarks, Long socialmarks, Long physicsmarks, Long totalmarks,
			Double averagemarks) {
		super();
		this.admissionnumber = admissionnumber;
		this.firstname = firstname;
		this.lastname = lastname;
		this.rollnumber = rollnumber;
		this.class_name = class_name;
		this.mathmarks = mathmarks;
		this.sciencemarks = sciencemarks;
		this.socialmarks = socialmarks;
		this.physicsmarks = physicsmarks;
		this.totalmarks = totalmarks;
		this.averagemarks = averagemarks;
	}

	public Long getAdmissionnumber() {
		return admissionnumber;
	}

	public void setAdmissionnumber(Long admissionnumber) {
		this.admissionnumber = admissionnumber;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public Long getMathmarks() {
		return mathmarks;
	}

	public void setMathmarks(Long mathmarks) {
		this.mathmarks = mathmarks;
	}

	public Long getSciencemarks() {
		return sciencemarks;
	}

	public void setSciencemarks(Long sciencemarks) {
		this.sciencemarks = sciencemarks;
	}

	public Long getSocialmarks() {
		return socialmarks;
	}

	public void setSocialmarks(Long socialmarks) {
		this.socialmarks = socialmarks;
	}

	public Long getPhysicsmarks() {
		return physicsmarks;
	}

	public void setPhysicsmarks(Long physicsmarks) {
		this.physicsmarks = physicsmarks;
	}

	public Long getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(Long totalmarks) {
		this.totalmarks = totalmarks;
	}

	public Double getAveragemarks() {
		return averagemarks;
	}

	public void setAveragemarks(Double averagemarks) {
		this.averagemarks = averagemarks;
	}

	@Override
	public String toString() {
		return "Students [admissionnumber=" + admissionnumber + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", rollnumber=" + rollnumber + ", class_name=" + class_name + ", mathmarks=" + mathmarks
				+ ", sciencemarks=" + sciencemarks + ", socialmarks=" + socialmarks + ", physicsmarks=" + physicsmarks
				+ ", totalmarks=" + totalmarks + ", averagemarks=" + averagemarks + "]";
	}

}
