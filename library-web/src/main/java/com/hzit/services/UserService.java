package com.hzit.services;


import com.hzit.dao.entity.User;

/**
 * Created by Administrator on 2016/10/6.
 */
public interface UserService {
    /**
     * 根据用户名  密码 登录页面
     * @param username
     * @param password
     * @return
     */
    public User findUser(String username, String password);

    /**
     * 新增用户
     * @param user
     * @return
     */
    public  int inset(User user);

}
