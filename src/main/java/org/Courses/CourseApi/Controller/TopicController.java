package org.Courses.CourseApi.Controller;

import java.util.List;

import org.Courses.CourseApi.Model.Topic;
import org.Courses.CourseApi.Service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	
	@GetMapping("/topics")
	public List<Topic> getTopics()
	{
		return topicService.getAllTopics();
	}

	@GetMapping("/topics/{id}")
	public Topic getTopicById(@PathVariable String id)
	{
		return topicService.getTopicById(id); 
	}
	
	/*@GetMapping("/topics/{name}")
	public Topic getTopicByName(@PathVariable String name)
	{
		return topicService.getTopicByName(name); 
	}*/
	
	@PostMapping("/topics")
	public void createTopic(@RequestBody Topic topic)
	{
		topicService.addNewTopics(topic);
	}
	
	@PostMapping("/topics/all")
	public void createTopic(@RequestBody List<Topic> topics)
	{
		topicService.AddListOfNewTopics(topics);
	}
	
	@PutMapping("/topics/{id}")
	public void updateTopicById(@PathVariable String id,@RequestBody Topic topic)
	{
		topicService.getUpdateTopicById(id,topic);
	}
}
