package com.SpringBoot.Viveka.Services;

import java.util.List;

import com.SpringBoot.Viveka.entities.Course;

public interface CourseService {

	public List<Course> getCourses();

    Course getCourse(Long id);

    Course addCourse(Course course);
}
