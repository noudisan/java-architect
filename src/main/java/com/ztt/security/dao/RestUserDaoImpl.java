package com.ztt.security.dao;

/**
 * Created by noudisan on 2014/9/14.
 */
public class RestUserDaoImpl {

    public RestUser loadByName(String name){
        RestUser sysUser = new RestUser();
        sysUser.setName(name);
        sysUser.setPassworld("123");
        return sysUser;
    }
}
