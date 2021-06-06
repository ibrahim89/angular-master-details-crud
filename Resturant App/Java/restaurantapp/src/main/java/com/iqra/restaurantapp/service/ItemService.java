package com.iqra.restaurantapp.service;

import com.iqra.restaurantapp.entity.Item;
import com.iqra.restaurantapp.utils.ApiResponse;

public interface ItemService {

	ApiResponse<Item> getItemList();
}
