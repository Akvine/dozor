package ru.akvine.dozor.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@JmixEntity
@Entity
@Table(name = "Dictionary", indexes = {
        @Index(name = "IDX_DICTIONARY_OWNER", columnList = "OWNER_ID")
})
public class Dictionary {
    @Id
    @Column(name = "ID", nullable = false, updatable = false)
    @JmixGeneratedValue
    private UUID id;

    @JoinColumn(name = "OWNER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User owner;

    @InstanceName
    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "ITEMS", nullable = false)
    private List<String> values = List.of();

    @Column(name = "IS_SYSTEM", nullable = false)
    private Boolean system = false;

    @Column(name = "DESCRIPTION")
    private String description;

    public void setValues(List<String> values) {
        this.values = values;
    }

    public List<String> getValues() {
        return values;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSystem() {
        return system;
    }

    public void setSystem(Boolean system) {
        this.system = system;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
