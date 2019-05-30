package com.caowei.neo4jdemo.common;

import org.neo4j.ogm.typeconversion.AttributeConverter;

import java.util.UUID;

import javax.validation.constraints.NotNull;

public class UUIDConverter implements AttributeConverter<UUID, String> {
    @Override
    public String toGraphProperty(UUID value) {
        return value == null ? null : value.toString();
    }

    @Override
    public UUID toEntityAttribute(String value) {
        return value == null ? null :UUID.fromString(value);
    }

    public static UUID stringToUUID (@NotNull String uuid) {
        return UUID.fromString(uuid);
    }

}
