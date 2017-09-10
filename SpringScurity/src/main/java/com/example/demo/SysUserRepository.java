package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/9/10.
 */
public interface SysUserRepository extends JpaRepository<SysUser,Long>{
    SysUser findByUsername(String username);
}
