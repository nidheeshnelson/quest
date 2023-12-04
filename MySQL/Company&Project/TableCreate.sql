/*Sql Questions part 3_230816_152908*/
create database companypraject;
use companypraject;
create table Employee_Details(EmpId int4, 
FirstName varchar(25), 
LastName varchar(25), 
Salary int8, 
Department varchar(50),
Gender varchar(10),
primary key(EmpId));

insert into Employee_Details(
EmpId,
FirstName, 
LastName,
Salary,
Department,
Gender)
values (1001,'vikas','balakrishnan',500000,'finance','male'),
(1002,'ashish','kumar',900000,'developer','male'),
(1003,'nikhil','arul',5000000,'desigin','male'),
(1004,'shalini','balakrishnan',600000,'database','female'),
(1005,'sasikala','sambasivan',400000,'clean','female'),
(1006,'vasu','devan',300000,'security','male'),
(1007,'dharmaraj','rasalam',200000,'driver','male'),
(1008,'akshara','balan',800000,'finance','female'),
(1009,'immanuel','sukumaran',5000000,'tester','male');

use companypraject;
create table ProjectDetails(
projectID varchar(15), 
empID int4, 
ProjectName varchar(50),
primary key(projectID),
foreign key(empID) references Employee_Details(EmpId));

insert into ProjectDetails(
projectID, 
empID, 
ProjectName)
values('P1',1002,'software1'),
('P2',1003,'software2'),
('P3',1004,'software3'),
('P4',1009,'software4');
