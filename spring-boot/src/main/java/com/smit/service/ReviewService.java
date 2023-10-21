package com.smit.service;

import java.util.List;

import com.smit.exception.ProductException;
import com.smit.modal.Review;
import com.smit.modal.User;
import com.smit.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
