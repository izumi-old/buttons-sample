package org.izumi.jmix.buttonssample.entity.resource;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import org.springframework.lang.Nullable;

@JmixEntity
@Table(name = "THING")
@Entity
public class Thing extends Resource {

    @InstanceName
    @Column(name = "DESCRIPTION", length = 1023)
    private String description;

    @Override
    public Type getType() {
        return Type.THING;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
