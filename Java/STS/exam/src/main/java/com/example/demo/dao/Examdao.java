package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Course;

@Repository
public interface Examdao extends JpaRepository<Course, Integer>{

//	@Query("SELECT a from course a where a.cid = ?1")
	Course findByCid(int cid);

	@Query("SELECT a FROM Course a")
	List<Course> getAllCourses();

}
