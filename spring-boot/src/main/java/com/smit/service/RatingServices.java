package com.smit.service;

import java.util.List;

import com.smit.exception.ProductException;
import com.smit.modal.Rating;
import com.smit.modal.User;
import com.smit.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
