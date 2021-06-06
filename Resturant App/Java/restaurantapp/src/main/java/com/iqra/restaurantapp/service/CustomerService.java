package com.iqra.restaurantapp.service;

import com.iqra.restaurantapp.entity.Customer;
import com.iqra.restaurantapp.utils.ApiResponse;

public interface CustomerService {

	ApiResponse<Customer> getAllCustomers();
}
