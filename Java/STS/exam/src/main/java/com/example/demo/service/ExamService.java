package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Examdao;
import com.example.demo.entity.Course;

@Service
public class ExamService implements ExamServiceInterface {

	@Autowired
	private Examdao examdao;
	
	@Override
	public List<Course> saveCourse(Course course) {
		examdao.save(course);
		return examdao.findAll();
	}

	@Override
	public List<Course> updateCourse(Course course) {
		examdao.save(course);
		return examdao.findAll();
	}

	@Override
	public List<Course> getAllCourses() {
		return examdao.findAll();
	}

	@Override
	public Course getCourseById(int cid) {
		return examdao.findByCid(cid);
	}

	@Override
	public void deleteCourseById(int cid) {
		examdao.deleteById(cid);
	}

}
