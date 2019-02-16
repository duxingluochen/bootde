package com.tuke.fm.bootde.common.config.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.tuke.fm.bootde.*.dao")
public class MyBatisConfig {
}
