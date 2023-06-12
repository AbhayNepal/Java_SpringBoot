package com.SpringBoot.dao;
import com.SpringBoot.Viveka.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long> {


}
