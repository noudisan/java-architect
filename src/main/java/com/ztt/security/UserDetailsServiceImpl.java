package com.ztt.security;

import com.ztt.security.dao.SysUser;
import com.ztt.security.dao.SysUserDaoImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Created by noudisan on 2014/9/14.
 */
public class UserDetailsServiceImpl implements UserDetailsService {
    private SysUserDaoImpl sysUserDao;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        SysUser value = sysUserDao.loadByName(userName);

        return new UserBean(value);
    }


    public void setSysUserDao(SysUserDaoImpl sysUserDao) {
        this.sysUserDao = sysUserDao;
    }
}
