package com.caowei.neo4jdemo.repository;

import com.caowei.neo4jdemo.entity.User;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author caowei
 * @mail 452701513@qq.com
 */

@Repository
public interface UserRepository extends Neo4jRepository<User, UUID> {
}
