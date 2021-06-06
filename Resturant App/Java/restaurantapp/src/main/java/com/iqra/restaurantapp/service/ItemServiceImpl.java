package com.iqra.restaurantapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqra.restaurantapp.entity.Item;
import com.iqra.restaurantapp.repo.ItemRepo;
import com.iqra.restaurantapp.utils.ApiResponse;
import com.iqra.restaurantapp.utils.ResponseStatus;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired 
	ItemRepo itemRepo;

	@Override
	public ApiResponse<Item> getItemList() {
		List<Item> itemList = (List<Item>) itemRepo.findAll();
		return new ApiResponse<>(ResponseStatus.SUCCESS.name(), ResponseStatus.SUCCESS.getValue(), itemList);
	}
	
}
