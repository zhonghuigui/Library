package com.hzit.dao.vo;

/**
 * 
 * @author SoulKing
 */
public class UserVo {
	/**
	 *  用户ID
	 */
	private Integer userId;
	/**
	 *  用户名
	 */
	private String userName;
	/**
	 *  密码
	 */
	private String userPassword;
	/**
	 *  邮箱
	 */
	private String userEmail;
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
	 * 用户名
	 * @param userName
	 */
	public void setUserName(String userName){
		this.userName = userName;
	}
	
    /**
     * 用户名
     * @return String
     */	
    public String getUserName(){
    	return userName;
    }
	/**
	 * 密码
	 * @param userPassword
	 */
	public void setUserPassword(String userPassword){
		this.userPassword = userPassword;
	}
	
    /**
     * 密码
     * @return String
     */	
    public String getUserPassword(){
    	return userPassword;
    }
	/**
	 * 邮箱
	 * @param userEmail
	 */
	public void setUserEmail(String userEmail){
		this.userEmail = userEmail;
	}
	
    /**
     * 邮箱
     * @return String
     */	
    public String getUserEmail(){
    	return userEmail;
    }
}