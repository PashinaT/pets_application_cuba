-- begin PETS_USERS
create table PETS_USERS (
    ID integer not null,
    --
    USER_LOGIN varchar(255) not null,
    USER_PASSWORD varchar(255) not null,
    --
    primary key (ID)
)^
-- end PETS_USERS
-- begin TABLE_SHELTER
create table TABLE_SHELTER (
    ID integer not null,
    UUID varchar(36),
    --
    NAME_SHELTER varchar(400),
    ADDRESS_SHELTER varchar(2096),
    --
    primary key (ID)
)^
-- end TABLE_SHELTER
-- begin TABLE_LIST_PETS
create table TABLE_LIST_PETS (
    ID integer not null,
    UUID varchar(36),
    --
    IS_FOUND boolean,
    IMAGE longvarchar,
    COLOR_LIST_PETS varchar(255),
    VIEW_LIST_PETS varchar(255),
    NAME_LIST_PETS varchar(255),
    PETS_ID_SHELTER integer,
    --
    primary key (ID)
)^
-- end TABLE_LIST_PETS
