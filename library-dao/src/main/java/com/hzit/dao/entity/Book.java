package com.hzit.dao.entity;

/**
 * 
 * @author SoulKing
 */
public class Book {
	/**
	 *  图书ID
	 */
	private Integer bookId;
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
	public void setBookId(Integer bookId){
		this.bookId = bookId;
	}
	
    /**
     * 图书ID
     * @return
     */	
    public Integer getBookId(){
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
     * @return
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
     * @return
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
     * @return
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
     * @return
     */	
    public String getBookPicture(){
    	return bookPicture;
    }
}