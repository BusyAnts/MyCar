package com.cimc.car;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chenz
 * @create 2019-12-18 21:30
 */
@SpringBootApplication
@MapperScan("com.cimc.car.mapper")
public class MyCarApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyCarApplication.class, args);
    }

}
