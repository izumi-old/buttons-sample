package org.izumi.jmix.buttonssample.entity.resource;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import io.jmix.core.metamodel.annotation.JmixEntity;

@JmixEntity
@Table(name = "ROOM")
@Entity
public class Room extends Resource {

    @Max(255)
    @Positive
    @Column(name = "CAPACITY", nullable = false)
    @NotNull
    private Integer capacity;

    @Override
    public Type getType() {
        return Type.ROOM;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
