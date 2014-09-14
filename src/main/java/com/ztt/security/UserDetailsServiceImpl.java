package com.ztt.security;

import com.ztt.security.dao.RestUser;
import com.ztt.security.dao.RestUserDaoImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Created by noudisan on 2014/9/14.
 */
public class UserDetailsServiceImpl implements UserDetailsService {
    private RestUserDaoImpl sysUserDao;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        RestUser value = sysUserDao.loadByName(userName);

        return new UserBean(value);
    }


    public void setSysUserDao(RestUserDaoImpl sysUserDao) {
        this.sysUserDao = sysUserDao;
    }
}
