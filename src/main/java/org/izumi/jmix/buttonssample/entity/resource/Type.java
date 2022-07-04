package org.izumi.jmix.buttonssample.entity.resource;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public enum Type implements EnumClass<Integer> {
    ROOM(10),
    THING(20);

    private final Integer id;

    Type(Integer value) {
        this.id = value;
    }

    @Nonnull
    public Integer getId() {
        return id;
    }

    @Nullable
    public static Type fromId(Integer id) {
        for (Type at : Type.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
