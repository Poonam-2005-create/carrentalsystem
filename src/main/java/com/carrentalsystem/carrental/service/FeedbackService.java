package com.carrentalsystem.carrental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carrentalsystem.carrental.entity.Feedback;
import com.carrentalsystem.carrental.repository.FeedbackRepository;

@Service
public class FeedbackService {
	private final FeedbackRepository feedbackRepository;


    public FeedbackService(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    public void saveFeedback(Feedback feedback) {
        feedbackRepository.save(feedback);
    }
}
