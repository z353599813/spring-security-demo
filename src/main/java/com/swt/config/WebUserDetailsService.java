package com.swt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class WebUserDetailsService implements UserDetailsService {

    @Autowired
    public PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //此处应通过用户名查询数据库获取密码
        String password = "123456";
        //加密
        password =  passwordEncoder.encode(password);
        return new User(username, password,
                //权限工具类，将权限用逗号隔开
                AuthorityUtils.commaSeparatedStringToAuthorityList("USER,ADMIN"));
    }
}
