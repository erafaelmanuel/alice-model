package com.remswork.project.alice.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Department {

	private long id;
	private String name;
	private String description;
	
	public Department() {
		super();
	}
	
	public Department(String name, String description) {
		this();
		this.name = name;
		this.description = description;
	}
	
	public Department(long id, String name, String description) {
		this(name, description);
		this.id = id;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
