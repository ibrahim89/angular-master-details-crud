package com.iqra.restaurantapp.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqra.restaurantapp.dto.OrderDto;
import com.iqra.restaurantapp.dto.OrderItemDto;
import com.iqra.restaurantapp.entity.Customer;
import com.iqra.restaurantapp.entity.Item;
import com.iqra.restaurantapp.entity.Order;
import com.iqra.restaurantapp.entity.OrderItems;
import com.iqra.restaurantapp.repo.OrderItemsRepo;
import com.iqra.restaurantapp.repo.OrderRepo;
import com.iqra.restaurantapp.utils.ApiResponse;
import com.iqra.restaurantapp.utils.ResponseStatus;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepo orderRepo;
	
	@Autowired
	OrderItemsRepo orderItemRepo;
	
	@Override
	public ApiResponse<Order> saveOrUpdateOrderItem(OrderDto orderDto) {
		
		Order orderMaster = new Order();
		orderMaster.setCustomer(new Customer(orderDto.getCustomerId()));
		if(orderDto.getOrderId()!=null) {
			orderMaster.setOrderId(orderDto.getOrderId());	
		}
		orderMaster.setGtotal(orderDto.getgTotal());
		orderMaster.setOrderNo(orderDto.getOrderNo());
		orderMaster.setPmethod(orderDto.getpMethod());
		List<OrderItemDto> orderItemList = orderDto.getOrderItems();
		Set<OrderItems> orderItemsDetailses = new HashSet<OrderItems>(0);
		if(orderItemList!=null && !orderItemList.isEmpty()) {
			for(OrderItemDto orderItemDto:orderItemList) {
				OrderItems orderItemsDetails = new OrderItems();
				orderItemsDetails.setOrder(orderMaster);
				orderItemsDetails.setItem(new Item(orderItemDto.getItemId()));
				orderItemsDetails.setQuantity(orderItemDto.getQuantity());
				orderItemsDetailses.add(orderItemsDetails);
			}
		}
		orderMaster.setOrderItemDetailses(orderItemsDetailses);
		orderRepo.save(orderMaster);
		
		return new ApiResponse<>("Successfully Saved", ResponseStatus.SUCCESS.getValue());
	}

	@Override
	public ApiResponse<Order> getOrderList() {
		List<OrderDto> orderDtoList = new ArrayList<>();
		List<Order> orderList = (List<Order>) orderRepo.findAll();
		OrderDto orderDto = null;
		for(Order order:orderList) {
			orderDto = new OrderDto();
			orderDto.setOrderNo(order.getOrderNo());
			orderDto.setOrderId(order.getOrderId());
			orderDto.setgTotal(order.getGtotal());
			orderDto.setpMethod(order.getPmethod());
			orderDto.setCustomerName(order.getCustomer().getName());
			orderDtoList.add(orderDto);
		}
		return new ApiResponse<>(ResponseStatus.SUCCESS.name(), ResponseStatus.SUCCESS.getValue(), orderDtoList);
	}

	@Override
	public ApiResponse<String> deleteOrder(long id) {
		Optional<Order> order = orderRepo.findById(id);
		if(order.isPresent()) {
			List<OrderItems> orderItems = orderItemRepo.findByOrder(new Order(id));
			orderItemRepo.deleteAll(orderItems);
			orderRepo.delete(order.get());
		}
		return new ApiResponse<>("Successfully Deleted", ResponseStatus.SUCCESS.getValue());
	}

}
