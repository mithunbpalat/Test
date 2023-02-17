package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course", catalog = "exam")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	
	private String course;
	
	private String fees;
	
	private String duration;

	public Course() {
		super();
	}

	public Course(int cid, String course, String fees, String duration) {
		super();
		this.cid = cid;
		this.course = course;
		this.fees = fees;
		this.duration = duration;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getFees() {
		return fees;
	}

	public void setFees(String fees) {
		this.fees = fees;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	

	
}
