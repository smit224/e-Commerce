package com.smit.service;

import com.smit.exception.ProductException;
import com.smit.modal.Cart;
import com.smit.modal.User;
import com.smit.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
