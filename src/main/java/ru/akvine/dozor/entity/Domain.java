package ru.akvine.dozor.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import ru.akvine.dozor.enums.Criticality;

import java.util.UUID;

@JmixEntity
@Entity
@Table(name = "DOMAIN", indexes = {
        @Index(name = "IDX_DOMAIN_OWNER", columnList = "OWNER_ID")
})
public class Domain {
    @Id
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false, updatable = false)
    private UUID id;

    @Column(name = "CRITICALLY_TYPE")
    private String criticallyType;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "IS_SYSTEM", nullable = false)
    private Boolean system = false;

    @Column(name = "REGEXP")
    @Nullable
    private String regex;

    @JoinColumn(name = "OWNER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User owner;

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Criticality getCriticallyType() {
        return criticallyType == null ? null : Criticality.fromId(criticallyType);
    }

    public void setCriticallyType(Criticality criticallyType) {
        this.criticallyType = criticallyType == null ? null : criticallyType.getId();
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

    @Nullable
    public String getRegex() {
        return regex;
    }

    public void setRegex(@Nullable String regex) {
        this.regex = regex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
