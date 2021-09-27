CREATE DATABASE if not exists AMVDB

USE AMVDB 

create table if not exists user(
    User_ID int UNIQUE auto_increment,
    Fname varchar(255),
    Lname varchar(255),
	Phone varchar(255),
	Username varchar (255),
    Password varchar(255),
    PRIMARY KEY (User_ID)
    );


#inserter en record av en bruker inn i databasen otra.
insert into user (
	User_firstName,
    User_lastName,
    User_Email,
    User_password,
    User_dob)
values (
    'trym',
    'Staurheim',
    'trym@example.com',
    '12345',
    '1993-25-09');