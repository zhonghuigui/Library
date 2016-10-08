package com.hzit.dao.entity;

/**
 * 
 * @author SoulKing
 */
public class Orderdetail {
	/**
	 *  订单详细表ID
	 */
	private Integer orderDetailsId;
	/**
	 *  订单ID
	 */
	private String orderId;
	/**
	 *  书本ID
	 */
	private String bookId;
	/**
	 *  交易价格
	 */
	private Integer dealprice;
	/**
	 *  数量
	 */
	private Integer count;
	/**
	 * 订单详细表ID
	 * @param orderDetailsId
	 */
	public void setOrderDetailsId(Integer orderDetailsId){
		this.orderDetailsId = orderDetailsId;
	}
	
    /**
     * 订单详细表ID
     * @return
     */	
    public Integer getOrderDetailsId(){
    	return orderDetailsId;
    }
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
	 * 书本ID
	 * @param bookId
	 */
	public void setBookId(String bookId){
		this.bookId = bookId;
	}
	
    /**
     * 书本ID
     * @return
     */	
    public String getBookId(){
    	return bookId;
    }
	/**
	 * 交易价格
	 * @param dealprice
	 */
	public void setDealprice(Integer dealprice){
		this.dealprice = dealprice;
	}
	
    /**
     * 交易价格
     * @return
     */	
    public Integer getDealprice(){
    	return dealprice;
    }
	/**
	 * 数量
	 * @param count
	 */
	public void setCount(Integer count){
		this.count = count;
	}
	
    /**
     * 数量
     * @return
     */	
    public Integer getCount(){
    	return count;
    }
}