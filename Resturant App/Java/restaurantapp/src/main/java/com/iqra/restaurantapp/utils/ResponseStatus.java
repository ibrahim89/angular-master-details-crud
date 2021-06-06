package com.iqra.restaurantapp.utils;

public enum ResponseStatus {
	
	SUCCESS(1),  ERROR(0);
	private final int value;
	  
	  private ResponseStatus(int value)
	  {
	    this.value = value;
	  }
	  
	  public int getValue()
	  {
	    return this.value;
	  }

}
