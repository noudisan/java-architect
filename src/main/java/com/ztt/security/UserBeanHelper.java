package com.ztt.security;

import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by noudisan on 2014/9/14.
 */
public class UserBeanHelper {

    public static UserBean currentUser() {
        if (SecurityContextHolder.getContext() == null && SecurityContextHolder.getContext().getAuthentication() == null) {
            return null;
        }
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        return principal instanceof UserBean ? (UserBean) principal : null;
    }
    /**
     * 当前登录用户的名称
     *
     * @return
     */
    public static String getUsername() {
        UserBean user = currentUser();
        if (user != null) {
            return user.getUsername();
        }
        return null;
    }
}
