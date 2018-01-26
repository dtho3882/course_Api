package org.Courses.CourseApi.Dao;

import org.Courses.CourseApi.Model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TopicRepository  extends JpaRepository<Topic,String> {

	
	
}
