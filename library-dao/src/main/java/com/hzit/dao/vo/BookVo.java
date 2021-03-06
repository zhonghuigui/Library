package com.hzit.dao.vo;

import java.io.Serializable;

/**
 * 
 * @author SoulKing
 */
public class BookVo implements Serializable {
	/**
	 * 购买图书的数量
	 */
	private  int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	/**
	 *  图书ID
	 */
	private String bookId;
	/**
	 *  图书名称
	 */
	private String bookName;
	/**
	 *  价格
	 */
	private Integer bookPrice;
	/**
	 *  库存
	 */
	private Integer bookCount;
	/**
	 *  图片
	 */
	private String bookPicture;
	/**
	 * 图书ID
	 * @param bookId
	 */
	public void setBookId(String bookId){
		this.bookId = bookId;
	}
	
    /**
     * 图书ID
     * @return Integer
     */	
    public String getBookId(){
    	return bookId;
    }
	/**
	 * 图书名称
	 * @param bookName
	 */
	public void setBookName(String bookName){
		this.bookName = bookName;
	}
	
    /**
     * 图书名称
     * @return String
     */	
    public String getBookName(){
    	return bookName;
    }
	/**
	 * 价格
	 * @param bookPrice
	 */
	public void setBookPrice(Integer bookPrice){
		this.bookPrice = bookPrice;
	}
	
    /**
     * 价格
     * @return Integer
     */	
    public Integer getBookPrice(){
    	return bookPrice;
    }
	/**
	 * 库存
	 * @param bookCount
	 */
	public void setBookCount(Integer bookCount){
		this.bookCount = bookCount;
	}
	
    /**
     * 库存
     * @return Integer
     */	
    public Integer getBookCount(){
    	return bookCount;
    }
	/**
	 * 图片
	 * @param bookPicture
	 */
	public void setBookPicture(String bookPicture){
		this.bookPicture = bookPicture;
	}
	
    /**
     * 图片
     * @return String
     */	
    public String getBookPicture(){
    	return bookPicture;
    }
}