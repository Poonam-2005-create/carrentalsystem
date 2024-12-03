package com.carrentalsystem.carrental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.carrentalsystem.carrental.entity.Feedback;
import com.carrentalsystem.carrental.service.FeedbackService;

public class FeedbackController {
	 private FeedbackService feedbackService;

	    @Autowired
	    public FeedbackController(FeedbackService feedbackService) {
	        this.feedbackService = feedbackService;
	    }

	    @GetMapping("/feedback")
	    public String getFeedbackPage(Model model) {
	        model.addAttribute("feedback", new Feedback());
	        return "feedback";
	    }

	    @PostMapping("/feedback")
	    public String submitFeedback(@ModelAttribute Feedback feedback, Model model) {
	        try {
	            feedbackService.saveFeedback(feedback);
	            model.addAttribute("message", "Thank you for your feedback!");
	        } catch (Exception e) {
	            model.addAttribute("error", "An error occurred.");
	        }
	        return "feedback";
	    }
}
