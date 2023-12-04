use commpany_data1;
drop table worker;
create table Worker(WORKER_ID int not null,
FIRST_NAME varchar(25) not null,
LAST_NAME varchar(25),
SALARY int,
JOINING_DATE datetime not null,
DEPARTMENT varchar(50) not null,
primary key (WORKER_ID)
);
insert into Worker(WORKER_ID, FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT)
values(001, 'Monika','Arora',100000,'2014-02-20 09:00:00', 'HR'),
(002,'Niharika','Verma',80000,'2014-02-20 09:00:00', 'Admin'),
(003,'Vishal','Singal',300000,'2014-02-20 09:00:00', 'HR'),
(004,'Amitabh','Singh',500000,'2014-02-20 09:00:00', 'Admin'),
(005,'Vivek','Bhati',500000,'2014-02-20 09:00:00', 'Admin'),
(006,'Vipul','Diwan',200000,'2014-02-20 09:00:00', 'Account'),
(007,'Satish','Kumar',75000,'2014-02-20 09:00:00', 'Account'),
(008,'Geetika','Chauhan',90000,'2014-02-20 09:00:00', 'Admin');
select * from worker;