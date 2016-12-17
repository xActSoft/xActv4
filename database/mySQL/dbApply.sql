create database if not exists xActv40001;

use xActv40001;




create table if not exists GlType
(
	id			bigint			not null,
    syscode		varchar(10)		not null,
    typeName	varchar(100)	not null,
    category	char(1)			not null,
    cre
    primary key ( id )
);



create table if not exists GlMaster
(
	id			bigint			not null,
    syscode		varchar(10)		not null,
    glname		varchar(255)	not null,
    glTypeId	bigint			not null,
    primary key ( id ),
    foreign key ( glTypeId ) references GlType ( id )
);