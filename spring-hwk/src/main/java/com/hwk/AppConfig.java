package com.hwk;

import com.hwk.annotation.EnableHwk;
import com.hwk.annotation.MyMapperScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.hwk")
@EnableHwk
@MyMapperScan("com.hwk.dao")
public class AppConfig {
}
