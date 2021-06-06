package com.iqra.restaurantapp.service;

import com.iqra.restaurantapp.dto.OrderDto;
import com.iqra.restaurantapp.entity.Order;
import com.iqra.restaurantapp.utils.ApiResponse;

public interface OrderService {
	
	ApiResponse<Order> saveOrUpdateOrderItem(OrderDto OrderDto);

	ApiResponse<Order> getOrderList();
	
	ApiResponse<String> deleteOrder(long id);
}
