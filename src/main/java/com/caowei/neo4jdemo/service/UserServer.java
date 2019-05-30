package com.caowei.neo4jdemo.service;

import com.caowei.neo4jdemo.common.UUIDConverter;
import com.caowei.neo4jdemo.entity.User;
import com.caowei.neo4jdemo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author caowei
 * @mail 452701513@qq.com
 */

@Service
public class UserServer {

    private final UserRepository userRepository;

    @Autowired
    UserServer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByUserId(String id) {
        return userRepository.findById(UUIDConverter.stringToUUID(id)).orElse(null);
    }

    public void save(User user) {
        userRepository.save(user);
    }

}
