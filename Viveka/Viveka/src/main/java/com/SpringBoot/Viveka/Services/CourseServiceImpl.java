package com.SpringBoot.Viveka.Services;

import  java.util.ArrayList;
import java.util.List;
import com.SpringBoot.Viveka.entities.Course;
import org.springframework.stereotype.Service;
@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;


	public CourseServiceImpl(){
		list = new ArrayList<>();
		list.add(new Course(145,"java Course","This course contains basic course of java"));
		list.add(new Course(146,"java Course 2","This course contains Intermediate course of java"));
		list.add(new Course(147,"java Course 3","This course contains Advanced course of java"));

	}
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(Long id) {
		Course c = null;
		for(Course course: list){
			if(course.getId() == id){
				c= course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}


}
