package com.zpj;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


/**
 * 启动类
 */
@ImportResource("classPath:UserMapper.xml" )
@SpringBootApplication
@MapperScan(basePackages = "com/zpj/dto/mapper", sqlSessionFactoryRef = "sqlSessionFactory")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
