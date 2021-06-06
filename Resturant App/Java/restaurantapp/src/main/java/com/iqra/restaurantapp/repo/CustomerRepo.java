package com.iqra.restaurantapp.repo;

import org.springframework.data.repository.CrudRepository;

import com.iqra.restaurantapp.entity.Customer;

public interface CustomerRepo extends CrudRepository<Customer, Long>{

}
