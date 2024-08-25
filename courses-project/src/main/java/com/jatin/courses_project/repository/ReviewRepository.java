package com.jatin.courses_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jatin.courses_project.entity.Review;

/**
 * ReviewRepository
 */
public interface ReviewRepository extends JpaRepository<Review, Integer> {

    List<Review> findByCourseId(Integer courseId);
	
}
