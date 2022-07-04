package org.izumi.jmix.buttonssample.entity.resource;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import org.izumi.jmix.buttonssample.entity.StandardEntity;

@JmixEntity
@Entity(name = "Resource")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Resource extends StandardEntity {

    @NotBlank
    @NotNull
    @InstanceName
    @Column(name = "NAME")
    private String name;

    public abstract Type getType();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
