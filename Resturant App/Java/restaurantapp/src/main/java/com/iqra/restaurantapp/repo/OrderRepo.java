package com.iqra.restaurantapp.repo;

import org.springframework.data.repository.CrudRepository;

import com.iqra.restaurantapp.entity.Order;

public interface OrderRepo extends CrudRepository<Order, Long>{

}
