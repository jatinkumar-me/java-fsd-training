package com.jatin.courses_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.jatin.courses_project.entity.Course;
import com.jatin.courses_project.repository.CourseRepository;

/**
 * CourseController
 */
@RestController
@RequestMapping("/api/courses")
public class CourseController {

	@Autowired
	CourseRepository courseRepository;

	@GetMapping
	public ResponseEntity<List<Course>> getAllCourses(
			@RequestParam(name = "isLaunched", required = false) Boolean isLaunched,
			@RequestParam(name = "title", required = false, defaultValue = "") String title) {

		List<Course> courses;

		if (!title.isEmpty()) {
			courses = isLaunched != null
					? courseRepository.findByIsLaunchedAndTitleContainingIgnoreCase(isLaunched, title)
					: courseRepository.findByTitle(title);
		} else {
			courses = isLaunched != null
					? courseRepository.findByIsLaunched(isLaunched)
					: courseRepository.findAll();
		}

		return new ResponseEntity<List<Course>>(courses, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Course> getCourseById(@PathVariable("id") Integer id) {
		Course course = courseRepository.findById(id)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Course not found"));
		return new ResponseEntity<Course>(course, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Course> createCourse(@RequestBody Course course) {
		Course newCourse = courseRepository.save(course);
		return new ResponseEntity<Course>(newCourse, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Course> updateCourse(@PathVariable("id") Integer id, @RequestBody Course course) {

		Course courseToUpdate = courseRepository.findById(id)
				.orElseThrow(
						() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Not Found course with ID: " + id));

		if (course.getTitle() != null) {
			courseToUpdate.setTitle(course.getTitle());
		}

		if (course.getDescription() != null) {
			courseToUpdate.setDescription(course.getDescription());
		}

		courseToUpdate.setLaunched(course.isLaunched());
		Course updatedCourse = courseRepository.save(courseToUpdate);
		return new ResponseEntity<>(updatedCourse, HttpStatus.CREATED);
	}

	@DeleteMapping("courses/{id}")
	public ResponseEntity<Course> deleteCourse(@PathVariable("id") Integer id) {

		courseRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
