package com.company.pets.entity;

import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Table(name = "TABLE_SHELTER")
@Entity(name = "pets_TableShelter")
public class TableShelter extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = 580092704208752730L;

    @Column(name = "UUID")
    private UUID uuid;

    @Column(name = "NAME_SHELTER", length = 400)
    private String nameShelter;

    @Column(name = "ADDRESS_SHELTER", length = 2096)
    private String addressShelter;

    public String getAddressShelter() {
        return addressShelter;
    }

    public void setAddressShelter(String addressShelter) {
        this.addressShelter = addressShelter;
    }

    public String getNameShelter() {
        return nameShelter;
    }

    public void setNameShelter(String nameShelter) {
        this.nameShelter = nameShelter;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}