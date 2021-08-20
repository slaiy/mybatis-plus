package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.atguigu.mapper")
public class MybatispulsMain {

    public static void main(String[] args) {

        SpringApplication.run(MybatispulsMain.class);
    }
}
