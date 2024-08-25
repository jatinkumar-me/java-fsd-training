package com.jatin.courses_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jatin.courses_project.entity.Review;
import com.jatin.courses_project.repository.CourseRepository;
import com.jatin.courses_project.repository.ReviewRepository;

/**
 * ReviewController
 */
@RestController
@RequestMapping("/api")
public class ReviewController {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	ReviewRepository reviewRepository;

	@GetMapping("/courses/{courseId}/reviews")
	public ResponseEntity<List<Review>> getAllReviewsByCourseId(@PathVariable(value = "courseId") Integer courseId)
			throws Exception {

		if (!courseRepository.existsById(courseId)) {
			throw new Exception("Not Found course with id: " + courseId);
		}

		List<Review> reviews = reviewRepository.findByCourseId(courseId);
		return new ResponseEntity<>(reviews, HttpStatus.OK);
	}

	@PostMapping("/courses/{courseId}/reviews")
	public ResponseEntity<Review> createReview(@PathVariable(value = "courseId") Integer courseId,
			@RequestBody Review courseReview) throws Exception {

		Review review = courseRepository.findById(courseId).map(course -> {
			courseReview.setCourse(course);
			return reviewRepository.save(courseReview);
		}).orElseThrow(() -> new Exception("Not Found course with id: " + courseId));
		return new ResponseEntity<>(review, HttpStatus.CREATED);

	}
}
