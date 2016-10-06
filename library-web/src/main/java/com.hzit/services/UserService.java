package com.hzit.services;

import com.hzit.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2016/10/6.
 */
public interface UserService {
    public List<com.hzit.dao.entity.User> findAll();
}
