create database if not exists xActv40001;

use xActv40001;

create table if not exists GlType
(
	id			bigint			not null AUTO_INCREMENT,
    syscode		varchar(10)		not null,
    typeName	varchar(100)	not null,
    category	char(1)			not null,
    CreDtTime	datetime		not null,
    LastCngDtTime datetime      not null,
    CreUserId   bigint			not null,
    LastCngUserId bigint        not null,
    primary key ( id )
);



create table if not exists GlMaster
(
	id			bigint			not null AUTO_INCREMENT,
    syscode		varchar(10)		not null,
    glname		varchar(255)	not null,
    glTypeId	bigint			not null,
    CreDtTime	datetime		not null,
    LastCngDtTime datetime      not null,
    CreUserId   bigint			not null,
    LastCngUserId bigint        not null,    
    primary key ( id ),
    foreign key ( glTypeId ) references GlType ( id )
);