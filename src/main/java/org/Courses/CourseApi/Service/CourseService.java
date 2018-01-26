package org.Courses.CourseApi.Service;

import java.util.List;

import org.Courses.CourseApi.Model.Course;
import org.springframework.stereotype.Service;


public interface CourseService {

	public List<Course> getAllCoursesByTopicId(String Id);
	public Course getCourseById(int id);
	public void addNewCourse(Course course);
	public void addListOfNewCourses(List<Course> courses);
	public void getUpdateCourseById(Course course);
	
	
}
