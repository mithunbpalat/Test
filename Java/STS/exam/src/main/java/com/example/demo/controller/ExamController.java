package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Course;
import com.example.demo.service.ExamService;

@RestController
@RequestMapping("/exam")
@CrossOrigin("*")
public class ExamController {
	
	@Autowired
	private ExamService examservice;
	
	@PostMapping(value="/savecourse")
	public List<Course> saveCourse(@RequestBody Course course) {
		return examservice.saveCourse(course);
	}

	@PostMapping(value="/updatecourse")
	public List<Course> updateCourse(@RequestBody Course course) {
		return examservice.updateCourse(course);
	}

	@GetMapping(value="/getallcourse")
	public List<Course> getAllCourses() {
		return examservice.getAllCourses();
	}

	@GetMapping(value="/getcourse")
	public Course getCourseById(@RequestParam int cid) {
		return examservice.getCourseById(cid);
	}

	@DeleteMapping(value="/deletecourse")
	public int deleteCourseById(@RequestParam int cid) {
		examservice.deleteCourseById(cid);
		return cid;
	}

	
}
