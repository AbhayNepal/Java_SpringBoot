package com.SpringBoot.Viveka.controller;

import java.util.List;

import com.SpringBoot.Viveka.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.SpringBoot.Viveka.entities.Course;

@RestController
public class ViveController {

	@Autowired
	private CourseService courseService;
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	
	
	@GetMapping("/Courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses() ;
		
	}

	@GetMapping("/Courses/{Id}")
	public Course getCourse(@PathVariable String Id){
		return  this.courseService.getCourse(Long.parseLong(Id));
	}

	@PostMapping("/Courses")
	public Course addCourse(@RequestBody Course course){
		return this.courseService.addCourse(course);
	}
}
