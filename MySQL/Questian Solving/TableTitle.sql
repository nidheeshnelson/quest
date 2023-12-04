/* create the table title*/
use commpany_data1;
drop table Title;
create table Title(
WORKER_REF_ID int unique auto_increment not null,
WORKER_TITLE varchar(50) not null,
AFFECTED_FROM datetime not null,
primary key(WORKER_REF_ID)
);
insert into Title(WORKER_REF_ID, WORKER_TITLE, AFFECTED_FROM)
values(1, 'Manager', '2016-02-20 00:00:00'),
(2,	'Executive',	'2016-06-11 00:00:00'),
(8,	'Executive',	'2016-06-11 00:00:00'),
(5,	'Manager',	'2016-06-11 00:00:00'),
(4,	'Asst. Manager',	'2016-06-11 00:00:00'),
(7,	'Executive', '2016-06-11 00:00:00' ),
(6,	'Lead',	'2016-06-11 00:00:00'),
(3,	'Lead',	'2016-06-11 00:00:00');
select * from Title;
