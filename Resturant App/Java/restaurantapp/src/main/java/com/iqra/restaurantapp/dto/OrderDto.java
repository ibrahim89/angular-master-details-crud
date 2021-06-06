package com.iqra.restaurantapp.dto;

import java.math.BigDecimal;
import java.util.List;

public class OrderDto {

	private Long orderId;
	private String orderNo;
	private Long customerId;
	private String customerName;
	private String pMethod;
	private BigDecimal gTotal;
	private List<OrderItemDto> orderItems;
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getpMethod() {
		return pMethod;
	}
	public void setpMethod(String pMethod) {
		this.pMethod = pMethod;
	}
	public BigDecimal getgTotal() {
		return gTotal;
	}
	public void setgTotal(BigDecimal gTotal) {
		this.gTotal = gTotal;
	}
	public List<OrderItemDto> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItemDto> orderItems) {
		this.orderItems = orderItems;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	
	
}
