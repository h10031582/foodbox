package com.mjava.foodbox.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjava.foodbox.model.Order;
import com.mjava.foodbox.repository.OrderRepository;
@Service
public class OrderService {
	
	@Autowired
	public OrderRepository orderRepo;
	
	public void insertOrderService(Order order)
	
	{
		orderRepo.save(order);
	}
	public List<Order> getAllOrdersService()

	{
			List<Order> listOrders;
			listOrders=orderRepo.findAll();
			return listOrders;
			}

}
