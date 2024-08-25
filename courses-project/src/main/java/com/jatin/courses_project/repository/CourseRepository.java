package com.jatin.courses_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jatin.courses_project.entity.Course;

/**
 * CourseRepository
 */
public interface CourseRepository extends JpaRepository<Course, Integer> {

	/**
	 * @param isLaunched
	 * @return
	 */
	List<Course> findByIsLaunched(boolean isLaunched);

	/**
	 * @param isLaunched
	 * @param title
	 * @return
	 */
	List<Course> findByIsLaunchedAndTitleContainingIgnoreCase(boolean isLaunched, String title);

    /**
     * @param title
     * @return
     */
    List<Course> findByTitle(String title);
}
