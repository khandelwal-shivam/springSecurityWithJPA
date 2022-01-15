database name = myhiber


creating USER tables in sql

 create table USER(
    ID int PRIMARY KEY,
    ACTIVE boolean,
    PASSWORD varchar(255) NOT NULL,
    Roles varchar(255),
    USER_Name varchar(255));

Inserting data into USER table.
insert into USER values(1,true,"pass","ROLE_USER","user");
