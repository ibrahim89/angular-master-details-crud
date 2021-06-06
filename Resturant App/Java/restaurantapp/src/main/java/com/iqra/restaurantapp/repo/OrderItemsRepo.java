package com.iqra.restaurantapp.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.iqra.restaurantapp.entity.Order;
import com.iqra.restaurantapp.entity.OrderItems;

public interface OrderItemsRepo extends CrudRepository<OrderItems, Long>{
	List<OrderItems> findByOrder(Order order);
}
