package org.Courses.CourseApi.Dao;

import java.util.List;

import org.Courses.CourseApi.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer>{

	public List<Course> findByTopicId(String Id);
}
