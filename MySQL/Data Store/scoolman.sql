create database scoolman;
use scoolman;
create table staff(
id int unique auto_increment not null,
name varchar(50) not null,
designation varchar(50) not null,
charge varchar(10),
phone int8 unique not null,
address varchar(100) not null,
joindate date not null,
password varchar(20) not null,
primary key(id));
drop table staff;
insert into teacher(name, designation, charge, phone, address, joindate, password) values();
select * from staff;
create table student(
id int unique auto_increment not null,
name varchar(50) not null,
std varchar(10) not null,
divi varchar(5) not null,
inchargeid int not null,
phone int8 not null unique,
address varchar(100) not null,
primary key (id),
foreign key (inchargeid) references staff(id));
drop table student;
insert into student
(name, std, divi, incharge, phone, address)
values();
select * from student;
create table mark(
id int unique auto_increment not null,
studid int not null,
year int not null,
term int not null,
date date not null,
mal int not null,
eng int not null,
hin int not null,
sci int not null,
ss int not null,
it int not null,
primary key(id),
foreign key(studid) references student(id));
drop table mark;
insert into mark(studid, year, term, date, mal, eng, hin, sci, ss, it) values();
select * from mark;