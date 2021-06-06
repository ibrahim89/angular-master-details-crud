package com.iqra.restaurantapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iqra.restaurantapp.dto.OrderDto;
import com.iqra.restaurantapp.entity.Customer;
import com.iqra.restaurantapp.entity.Item;
import com.iqra.restaurantapp.entity.Order;
import com.iqra.restaurantapp.service.CustomerService;
import com.iqra.restaurantapp.service.ItemService;
import com.iqra.restaurantapp.service.OrderService;
import com.iqra.restaurantapp.utils.ApiResponse;

@RestController
public class HomeController {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	ItemService itemService;
	
	@Autowired
	OrderService orderService;
	
	@GetMapping("/")
	public String getHome() {
		return "Server Started!!!!!";
	}

	@GetMapping("/Customers")
	public ApiResponse<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	@GetMapping("/Items")
	public ApiResponse<Item> getAllItems(){
		return itemService.getItemList();
	}
	
	@PostMapping("/saveOrder")
	public ApiResponse<Order> saveOrderItems(@RequestBody OrderDto orderDto){
		
		return orderService.saveOrUpdateOrderItem(orderDto);
	}
	
	@GetMapping("/orderList")
	public ApiResponse<Order> getOrderList(){
		return orderService.getOrderList();
	}
	
	@DeleteMapping("/deleteOrder/{id}")
	public ApiResponse<String> deleteById(@PathVariable Long id){
		System.out.println("Delete Method Call with ID:::"+id);
		return orderService.deleteOrder(id);
	}
	
}
