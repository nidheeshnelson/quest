create database website;
create table websitetable(
id int auto_increment unique not null,
data1 varchar(25) not null,
data2 varchar(25) not null,
data3 varchar(25) not null,
data4 varchar(25) not null,
phone int8 unique not null,
password varchar(25) not null,
primary key(id));
use website;
insert into websitetable(data1, data2, data3, data4, phone, password) 
values();
