create database ProjectServlet;
create table ServletTable(
id int8 auto_increment not null unique, 
firstname varchar(50) not null,
lastname varchar(50),
age int2 not null,
dob date not null,
place varchar(100) not null,
phone int8 not null unique,
email varchar(50) not null unique,
password varchar(25) not null,
primary key(id));
select * from ServletTable;
select id from servlettable order by id desc limit 1;
select * from servlettable where password = 11020110 and email = 'nidheeshnelson10@gmail.com';

firstname, lastname, age, dob, place, phone, email, password