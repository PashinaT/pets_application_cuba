package com.company.pets.web.screens.tablelistpets;

import com.haulmont.cuba.gui.screen.*;
import com.company.pets.entity.TableListPets;

@UiController("pets_TableListPets.browse")
@UiDescriptor("table-list-pets-browse.xml")
@LookupComponent("tableListPetsesTable")
@LoadDataBeforeShow
public class TableListPetsBrowse extends StandardLookup<TableListPets> {
}