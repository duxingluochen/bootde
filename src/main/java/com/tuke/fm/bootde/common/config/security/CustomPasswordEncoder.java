package com.tuke.fm.bootde.common.config.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * spring-security登陆的密码进行MD5加密传到数据库
 */
public class CustomPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        //String encode = encoder.encode(rawPassword.toString());
        return encoder.encode(rawPassword.toString());
    }
    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        //Md5PasswordEncoder encoder = new Md5PasswordEncoder();
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        return  encoder.matches(rawPassword.toString(),encodedPassword);
    }
}
