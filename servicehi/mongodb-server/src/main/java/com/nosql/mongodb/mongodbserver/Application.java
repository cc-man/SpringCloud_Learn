package com.nosql.mongodb.mongodbserver;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.nosql.mongodb.mongodbserver"})
public class Application  {
    private static final Logger logger = Logger.getLogger(Application.class);

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Application.class, args);
        logger.info("项目启动 ");
    }
}