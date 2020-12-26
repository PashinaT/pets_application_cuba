package com.company.pets.entity;

import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "TABLE_LIST_PETS")
@Entity(name = "pets_TableListPets")
public class TableListPets extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = 5656483926235128666L;

    @Column(name = "UUID")
    private UUID uuid;

    @Column(name = "IS_FOUND")
    private Boolean isFound;

    @Lob
    @Column(name = "IMAGE")
    private String image;

    @Column(name = "COLOR_LIST_PETS")
    private String colorListPets;

    @Column(name = "VIEW_LIST_PETS")
    private String viewListPets;

    @Column(name = "NAME_LIST_PETS")
    private String nameListPets;

    @JoinColumn(name = "PETS_ID_SHELTER")
    @OneToOne(fetch = FetchType.LAZY)
    private TableShelter petsIdShelter;

    public void setPetsIdShelter(TableShelter petsIdShelter) {
        this.petsIdShelter = petsIdShelter;
    }

    public TableShelter getPetsIdShelter() {
        return petsIdShelter;
    }

    public String getNameListPets() {
        return nameListPets;
    }

    public void setNameListPets(String nameListPets) {
        this.nameListPets = nameListPets;
    }

    public String getViewListPets() {
        return viewListPets;
    }

    public void setViewListPets(String viewListPets) {
        this.viewListPets = viewListPets;
    }

    public String getColorListPets() {
        return colorListPets;
    }

    public void setColorListPets(String colorListPets) {
        this.colorListPets = colorListPets;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getIsFound() {
        return isFound;
    }

    public void setIsFound(Boolean isFound) {
        this.isFound = isFound;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}