package com.nosql.mongodb.mongodbserver;

import java.util.List;

import com.nosql.mongodb.mongodbserver.model.Users;
import com.nosql.mongodb.mongodbserver.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages={"com.nosql.mongodb.mongodbserver"})
public class SpringbootMongodbApplication implements CommandLineRunner {

    @Autowired
    private IUserService userService;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMongodbApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        try {
            Users users = new Users("1", "小明", 10);
            users.setAddress("青岛市");
            userService.saveUser(users);
            List<Users> list = userService.listUser();
            System.out.println("一共这么多人:"+list.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
