package com.ztt.security;

import com.ztt.security.dao.RestUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

/**
 * Created by noudisan on 2014/9/14.
 */
public class UserBean implements UserDetails{

    private RestUser sysUser;
    private List<String> roles = new ArrayList<>();
    public UserBean(RestUser sysUser) {
        this.sysUser = sysUser;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        /*for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }*/
        return authorities;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return sysUser.getName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

}
