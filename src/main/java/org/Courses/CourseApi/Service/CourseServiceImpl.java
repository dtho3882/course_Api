package org.Courses.CourseApi.Service;

import java.util.List;

import org.Courses.CourseApi.Dao.CourseRepository;
import org.Courses.CourseApi.Model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public List<Course> getAllCoursesByTopicId(String Id) {
		
		return courseRepository.findByTopicId(Id);
	}

	@Override
	public Course getCourseById(int id) {
		
		return courseRepository.findOne(id );
	}

	@Override
	public void addNewCourse(Course course) {
		courseRepository.save(course);
		
	}

	@Override
	public void addListOfNewCourses(List<Course> courses) {
		courseRepository.save(courses);
		
	}

	@Override
	public void getUpdateCourseById(Course course) {
		courseRepository.save(course);
		
	}
	
	
	

}
