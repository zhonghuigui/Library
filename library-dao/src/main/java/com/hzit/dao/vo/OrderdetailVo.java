package com.hzit.dao.vo;

/**
 * 
 * @author SoulKing
 */
public class OrderdetailVo {
	/**
	 *  订单详细表ID
	 */
	private Integer orderDetailsId;
	/**
	 *  订单ID
	 */
	private Integer orderId;
	/**
	 *  书本ID
	 */
	private Integer bookId;
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
     * @return Integer
     */	
    public Integer getOrderDetailsId(){
    	return orderDetailsId;
    }
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
	 * 书本ID
	 * @param bookId
	 */
	public void setBookId(Integer bookId){
		this.bookId = bookId;
	}
	
    /**
     * 书本ID
     * @return Integer
     */	
    public Integer getBookId(){
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
     * @return Integer
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
     * @return Integer
     */	
    public Integer getCount(){
    	return count;
    }
}