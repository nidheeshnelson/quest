create database datastore;
use datastore;
create table datastoretable(
id int auto_increment unique not null,
name varchar(30) not null,
age int not null,
place varchar(30) not null,
job varchar(30) not null,
phone int8 unique not null,
address varchar(100) not null,
password varchar(20) not null
);
insert into datastoretable(name, age, place, job, phone, address, password) values();
select * from datastoretable;
select * from datastoretable where phone = 8086906582 and password = 11020110;
select * from datastoretable where id = 1;
