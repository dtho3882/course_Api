package org.Courses.CourseApi.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Component -> not creating an instance of it

@Entity
public class Topic 
{
	@Id
	private String id;
	private String name;
	private String description;
	
	public Topic()
	{
		super();
	}
	public Topic(String id, String name, String description)
	{
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	
	
	
}
