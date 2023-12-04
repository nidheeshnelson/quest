create database jdbcschool;
use jdbcschool;
create table studentlist(
id int auto_increment,
name varchar(50) not null,
primary key (id));
create table marklist(
sl int auto_increment,
id int not null unique,
physics int not null,
chemistry int not null,
biology int not null,
maths int not null,
total int2 not null,
primary key (sl),
foreign key (id) references studentlist(id));
create table contact(
sl int auto_increment,
id int not null unique,
address varchar(100) not null,
ph int8 not null,
primary key(sl),
foreign key(id) references studentlist(id));
select studentlist.id, studentlist.name, 
marklist.physics, marklist.chemistry, 
marklist.biology, marklist.maths, marklist.total,
contact.address, contact.ph
from studentlist join marklist on studentlist.id = marklist.id join contact on studentlist.id = contact.id where studentlist.id = 1;
select * from studentlist;
select * from marklist;
select * from contact;