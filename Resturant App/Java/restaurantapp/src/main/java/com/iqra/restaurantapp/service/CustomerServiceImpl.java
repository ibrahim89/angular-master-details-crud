package com.iqra.restaurantapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqra.restaurantapp.entity.Customer;
import com.iqra.restaurantapp.repo.CustomerRepo;
import com.iqra.restaurantapp.utils.ApiResponse;
import com.iqra.restaurantapp.utils.ResponseStatus;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepo customerRepo;
	@Override
	public ApiResponse<Customer> getAllCustomers() {
		
		return new ApiResponse<>(ResponseStatus.SUCCESS.name(), ResponseStatus.SUCCESS.getValue(), customerRepo.findAll());
	}

	
}
