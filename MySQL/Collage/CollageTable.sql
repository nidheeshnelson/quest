/*create table with Student*/
create database Collage;
use Collage;
create table Students(
S_ID varchar(10),
S_Name varchar(50),
Reg_No int8 unique,
Department varchar(10),
Sem varchar(5),
primary key (S_ID));
insert into Students(S_ID, S_Name, Reg_No, Department, Sem)
values ('10E1','Nidheesh Nelson',100011,'EC','S8'),
('16E1','Braji UM',100012,'CV','S1'),
('12E1','Nidhin Nelson',100013,'CS','S6'),
('14E1','Nimin Das',100014,'BM','S4'),
('17E1','Preethi',100015,'BT','S1'),
('18E1','Anila',100016,'EE','S1'),
('19E1','Nikhil Das',100017,'ME','S1');
use Collage;
Create table MarksNP(M_ID varchar(10), 
Phy int, 
Chem int, 
Math int, 
Bio int, 
foreign key(M_ID) references Students (S_ID));
insert into MarksNP(M_ID, Phy, Chem, Math, Bio)
values ('12E1',45,35,48,50),
('17E1',45,35,48,50);
