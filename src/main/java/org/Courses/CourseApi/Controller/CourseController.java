package org.Courses.CourseApi.Controller;

import java.util.List;

import org.Courses.CourseApi.Model.Course;
import org.Courses.CourseApi.Model.Topic;
import org.Courses.CourseApi.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	CourseService courseServiceImpl;
	
	@GetMapping("/topics/{Id}/courses")
	public List<Course> getCourses(@PathVariable String Id)
	{
		return courseServiceImpl.getAllCoursesByTopicId(Id);
	}

	@GetMapping("/courses/{id}")
	public Course getTopicById(@PathVariable int id)
	{
		return courseServiceImpl.getCourseById(id); 
	}
	
	/*@GetMapping("/topics/{name}")
	public Topic getTopicByName(@PathVariable String name)
	{
		return topicService.getTopicByName(name); 
	}*/
	
	@PostMapping("/courses")
	public void createCourse(@RequestBody Course course)
	{
		courseServiceImpl.addNewCourse(course);
	}
	
	@PostMapping("/courses/all")
	public void createTopic(@RequestBody List<Course> courses)
	{
		courseServiceImpl.addListOfNewCourses(courses);
	}
	
	@PutMapping("/courses/{id}")
	public void updateCourseById(@PathVariable int id,@RequestBody Course course)
	{
		courseServiceImpl.getUpdateCourseById(course);
	}
}
