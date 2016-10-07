package com.hzit.services;


import com.hzit.dao.entity.User;

/**
 * Created by Administrator on 2016/10/6.
 */
public interface UserService {
    public User findUser(String username, String password);
    public  int inset(User user);

}
