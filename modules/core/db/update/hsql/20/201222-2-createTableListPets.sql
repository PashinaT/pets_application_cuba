alter table TABLE_LIST_PETS add constraint FK_TABLE_LIST_PETS_ON_PETS_ID_SHELTER foreign key (PETS_ID_SHELTER) references TABLE_SHELTER(ID);
create index IDX_TABLE_LIST_PETS_ON_PETS_ID_SHELTER on TABLE_LIST_PETS (PETS_ID_SHELTER);
