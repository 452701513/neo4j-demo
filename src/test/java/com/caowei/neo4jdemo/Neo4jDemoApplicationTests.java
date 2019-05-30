package com.caowei.neo4jdemo;

import com.caowei.neo4jdemo.entity.User;
import com.caowei.neo4jdemo.service.UserServer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Neo4jDemoApplicationTests {

    @Autowired
    private UserServer userServer;

    @Test
    public void contextLoads() {
        User user = new User();
        user.setName("小明");
        user.setAge(19);
        user.setGender("男");
        user.setJob("工程师");

        userServer.save(user);
    }

    @Test
    public void findById () {

        User user = userServer.findByUserId("964068a6-b8e8-4098-b42b-9bd73ecbfb08");
        System.out.println(user);
    }

}
