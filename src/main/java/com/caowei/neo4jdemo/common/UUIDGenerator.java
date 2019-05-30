package com.caowei.neo4jdemo.common;


import org.neo4j.ogm.id.IdStrategy;

import java.util.UUID;

/**
 * @author caowei
 * @mail 452701513@qq.com
 */

public class UUIDGenerator implements IdStrategy {
    @Override
    public Object generateId(Object entity) {
        return UUID.randomUUID();
    }
}
