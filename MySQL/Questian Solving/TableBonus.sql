/* Creating sample table - Bonus */
use commpany_data1;
drop table Bonus;
create table Bonus(
WORKER_REF_ID int not null,
BONUS_DATE datetime not null,
BONUS_AMOUNT int2 not null
);
insert into Bonus(WORKER_REF_ID,BONUS_DATE,BONUS_AMOUNT)
values(1, '2016-02-20 00:00:00', 5000),
(2, '2016-06-11 00:00:00', 3000),
(3, '2016-02-20 00:00:00', 4000),
(1, '2016-02-20 00:00:00', 4500),
(2, '2016-06-11 00:00:00', 3500);
select * from Bonus;