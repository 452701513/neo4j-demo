package com.caowei.neo4jdemo.entity;

import com.caowei.neo4jdemo.common.UUIDConverter;
import com.caowei.neo4jdemo.common.UUIDGenerator;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.typeconversion.Convert;

import java.util.UUID;

import lombok.Data;

/**
 * @author caowei
 * @mail 452701513@qq.com
 */

@Data
@NodeEntity()
public class User {

    @Id
    @GeneratedValue(strategy = UUIDGenerator.class)
    @Convert(UUIDConverter.class)
    @Index(unique = true)
    private UUID id;

    @Index(unique = true)
    private String name;

    private String gender;

    private int age;

}
