package ru.akvine.dozor.enums;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum Criticality implements EnumClass<String> {
    LOW("low"),
    MEDIUM("medium"),
    HIGH("high"),
    CRITICAL("critical");

    private final String id;

    Criticality(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Criticality fromId(String id) {
        for (Criticality at : Criticality.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}