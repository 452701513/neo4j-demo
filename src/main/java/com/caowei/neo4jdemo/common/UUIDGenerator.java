package com.caowei.neo4jdemo.common;


import org.neo4j.ogm.id.IdStrategy;

import java.util.UUID;

public class UUIDGenerator implements IdStrategy {
    @Override
    public Object generateId(Object entity) {
        return UUID.randomUUID();
    }
}
