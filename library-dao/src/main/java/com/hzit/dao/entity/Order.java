package com.hzit.dao.entity;

/**
 * 
 * @author SoulKing
 */
public class Order {
	/**
	 *  订单ID
	 */
	private String orderId;
	/**
	 *  订单价格
	 */
	private Integer orderPrice;
	/**
	 *  创建时间
	 */
	private java.util.Date date;
	/**
	 *  用户ID
	 */
	private String userId;
	/**
	 *  订单状态
	 */
	private String orderStatus;
	/**
	 * 订单ID
	 * @param orderId
	 */
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}
	
    /**
     * 订单ID
     * @return
     */	
    public String getOrderId(){
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
     * @return
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
     * @return
     */	
    public java.util.Date getDate(){
    	return date;
    }
	/**
	 * 用户ID
	 * @param userId
	 */
	public void setUserId(String userId){
		this.userId = userId;
	}
	
    /**
     * 用户ID
     * @return
     */	
    public String getUserId(){
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
     * @return
     */	
    public String getOrderStatus(){
    	return orderStatus;
    }
}