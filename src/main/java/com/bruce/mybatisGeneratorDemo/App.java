package com.bruce.mybatisGeneratorDemo;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * Created by bruce.ge on 2017/2/13.
 */
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class App {
    @Value("${db.url}")
    private String dbUrl;


    @Value("${db.username}")
    private String dbUserName;


    @Value("${db.password}")
    private String dbPassword;


    @RequestMapping("/")
    String home() {
        return "hello world";
    }

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);
    }


    @Bean(initMethod = "init")
    public DataSource dataSource() {
        DruidDataSource source = new DruidDataSource();
        source.setUsername(dbUserName);
        source.setPassword(dbPassword);
        source.setUrl(dbUrl);
        return source;
    }

}
