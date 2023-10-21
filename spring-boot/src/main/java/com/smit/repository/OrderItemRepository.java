package com.smit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smit.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
