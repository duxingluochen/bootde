package com.tuke.fm.bootde.sys.dao;

import com.tuke.fm.bootde.sys.entity.User;

/**
 *
 */
public class UserDao {
    /**
     * 根据账户来获取用户信息
     * @param Login
     * @return
     */
    User findByLogin(String Login);
}
