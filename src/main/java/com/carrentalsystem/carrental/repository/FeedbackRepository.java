package com.carrentalsystem.carrental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carrentalsystem.carrental.entity.Feedback;
@Repository
public interface FeedbackRepository extends JpaRepository<Feedback,Long> {

}
