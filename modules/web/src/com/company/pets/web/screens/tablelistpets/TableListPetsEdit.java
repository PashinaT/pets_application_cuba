package com.company.pets.web.screens.tablelistpets;

import com.haulmont.cuba.gui.screen.*;
import com.company.pets.entity.TableListPets;

@UiController("pets_TableListPets.edit")
@UiDescriptor("table-list-pets-edit.xml")
@EditedEntityContainer("tableListPetsDc")
@LoadDataBeforeShow
public class TableListPetsEdit extends StandardEditor<TableListPets> {
}