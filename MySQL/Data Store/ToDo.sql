create database todo;
use todo;
create table list(slno int unique auto_increment, content varchar(100));
insert into list(content) values('wake up at 5am');
select * from list;
update list set content= 'fresh up at 5:30am';
