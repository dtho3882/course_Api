package org.Courses.CourseApi.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.Courses.CourseApi.Dao.TopicRepository;
import org.Courses.CourseApi.Model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	
	
	public List<Topic> getAllTopics()
	{
		return topicRepository.findAll();
		
	}
	
	public Topic getTopicById(String id)
	{
		return topicRepository.findOne(id);
	}
	
	/*public Topic getTopicByName(String name)
	{
		return topicRepository.
	}*/
	
	public void addNewTopics(Topic topic )
	{
		topicRepository.save(topic);
	}
	public void AddListOfNewTopics(List<Topic> topics )
	{
		topicRepository.save(topics);
	}
	
	public void getUpdateTopicById(String id,Topic topic)
	{
		topicRepository.save(topic);
		
	}
}

