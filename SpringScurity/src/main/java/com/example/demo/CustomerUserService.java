package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Created by Administrator on 2017/9/10.
 */
public class CustomerUserService implements UserDetailsService{
    @Autowired
    SysUserRepository sysUserRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user = sysUserRepository.findByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        return  user;
    }
}
