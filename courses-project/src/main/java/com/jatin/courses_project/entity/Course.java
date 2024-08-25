package com.jatin.courses_project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Course
 */
@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	private String title;
	private String description;
	@Column(nullable = false)
	private boolean isLaunched;

	public int getId() {
		return id;
	}
	public void setId(int courseId) {
		this.id = courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isLaunched() {
		return isLaunched;
	}
	public void setLaunched(boolean isLaunched) {
		this.isLaunched = isLaunched;
	}
}
