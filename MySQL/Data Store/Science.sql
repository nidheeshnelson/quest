Create database science;
use science;

create table student(
id int auto_increment unique not null,
name varchar(100) not null,
email varchar(80) not null unique,
phone int8 not null unique,
department varchar(10) not null,
joinyear int4 not null,
joinsem int not null, 
primary key(id));
insert into student(name, email, phone, department, joinyear, joinsem) values('nn', 'nn@n', 12358, 'CS', 2010, 1);
update student set email = 'no@n', phone=14 where id=1;
select * from student;
select * from student where id=1;
select max(id) from student;
alter table student add staffid int not null;
alter table student add foreign key(staffid) references staff(id);
delete student.* from student where id='4';

create table staff(
id int auto_increment unique not null,
name varchar(100) not null,
email varchar(80) not null unique,
phone int8 not null unique,
role varchar(20) not null,
primary key(id));
insert into staff(id, name, email, phone, role) values(1,'nidheesh', 'nid@n', 123, 'lucture');
select * from staff;
select * from staff where phone=14;
select max(id) from staff;
select max(id) from staff;
alter table staff add department varchar(10) not null;
alter table staff drop column role;
alter table staff add user varchar(30) not null unique;
alter table staff add password varchar(30) not null unique;
update staff set user='nidheesh' where id=1;
update staff set password='nid' where id=1;
update staff set name='', email='',phone='',user='',password='' where id=14;

create table login(
id int auto_increment unique not null,
staffid int unique,
studid int unique,
user varchar(30) not null unique,
password varchar(30) not null,
primary key(id),
foreign key(staffid) references staff(id),
foreign key(studid) references student(id));
insert into login(staffid, studid, user, password) values();
insert into login(staffid, user, password) values(1, 'nidheesh', 'nid');
insert into login(studid, user, password, status) values(1, 'nn', 'nn', 0);
alter table login modify column staffid int login not null;
alter table login add status int not null;
alter table login drop column status;
update login set status=1 where id=2;
update login set user='', password='' where staffid=14;
alter table login rename column id to loginid;
select * from login;
select * from login where user='nn' and password='nn';
delete login.* from login where studid=4;

create table mark(
id int auto_increment unique not null,
studid int unique not null,
department varchar(10) not null,
sem int not null,
sub1 int not null,
sub2 int not null,
sub3 int not null,
sub4 int not null,
sub5 int not null,
primary key(id),
foreign key(studid) references student(id));
alter table mark add staffid int not null;
alter table mark modify studid int not null;
alter table mark drop column department;
alter table mark rename column id to markid;
insert into mark(studid, sem, sub1, sub2, sub3, sub4, sub5) values(1, 1, 100, 100, 100, 100, 100);
select * from mark;
delete mark.* from mark where studid=4;

select * from login inner join student on student.id = login.studid inner join staff on staff.id = login.staffid;
select * from student inner join mark on mark.studid = student.id;
select * from student inner join mark on mark.studid = student.id inner join login on login.studid=student.id where id=1;
select * from student inner join mark on mark.studid = student.id inner join login on login.studid=student.id;
select * from login inner join student on student.id = login.studid inner join staff on staff.id = login.staffid where user='nidheesh' and password='nid';
select * from login inner join staff on staff.id=login.staffid where user='nidheesh' and password='nid';
select * from student inner join login on login.studid=student.id where id=1;
select * from student inner join mark on mark.studid = student.id inner join login on login.studid=student.id where mark.staffid=16;

delete student.*,login.*,mark.* from student,mark,login inner join student on student.id=login.studid inner join student on student.id=mark.studid where id=1;
delete mark.* from mark where studid=1;
delete login.* from login where studid=1;
delete student.* from student where id=1;

update student set name='abab',email='abab@ab',phone=1515,department='CS',joinyear=2024,joinsem=2 where id=7;
update login set user='',password='' where studid='';
update student, login set student.email='n@n', student.phone=111, login.user='n',login.password='n' from student,login inner join student on student.id=login.studid where student.id=1;