package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Course;

public interface ExamServiceInterface {

	public  List<Course> saveCourse(Course course);
	
	public  List<Course> updateCourse(Course course);
	
	public List<Course> getAllCourses();
	
	public Course getCourseById(int cid);
	
	public void deleteCourseById(int cid);
	
}
