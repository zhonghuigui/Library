package com.hzit.dao.vo;

import java.util.List;

/**
 * 
 * @author SoulKing
 */
public class OrderVo {
	/**
	 *  订单ID
	 */
	private Integer orderId;
	/**
	 *  订单价格
	 */
	private Integer orderPrice;

	public List<BookVo> getBookVoList() {
		return bookVoList;
	}

	public void setBookVoList(List<BookVo> bookVoList) {
		this.bookVoList = bookVoList;
	}

	/**
	 * 订单中所有购买的图书集合
	 * @param orderid
	 */
	private List<BookVo> bookVoList;

	/**
	 *  创建时间
	 */
	private java.util.Date date;
	/**
	 *  用户ID
	 */
	private Integer userId;
	/**
	 *  订单状态
	 */
	private String orderStatus;
	/**
	 * 订单ID
	 * @param orderId
	 */
	public void setOrderId(Integer orderId){
		this.orderId = orderId;
	}
	
    /**
     * 订单ID
     * @return Integer
     */	
    public Integer getOrderId(){
    	return orderId;
    }
	/**
	 * 订单价格
	 * @param orderPrice
	 */
	public void setOrderPrice(Integer orderPrice){
		this.orderPrice = orderPrice;
	}
	
    /**
     * 订单价格
     * @return Integer
     */	
    public Integer getOrderPrice(){
    	return orderPrice;
    }
	/**
	 * 创建时间
	 * @param date
	 */
	public void setDate(java.util.Date date){
		this.date = date;
	}
	
    /**
     * 创建时间
     * @return java.util.Date
     */	
    public java.util.Date getDate(){
    	return date;
    }
	/**
	 * 用户ID
	 * @param userId
	 */
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	
    /**
     * 用户ID
     * @return Integer
     */	
    public Integer getUserId(){
    	return userId;
    }
	/**
	 * 订单状态
	 * @param orderStatus
	 */
	public void setOrderStatus(String orderStatus){
		this.orderStatus = orderStatus;
	}
	
    /**
     * 订单状态
     * @return String
     */	
    public String getOrderStatus(){
    	return orderStatus;
    }
}