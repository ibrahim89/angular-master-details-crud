package com.iqra.restaurantapp.repo;

import org.springframework.data.repository.CrudRepository;

import com.iqra.restaurantapp.entity.Item;

public interface ItemRepo extends CrudRepository<Item, Long>{

}
