/*Q-28. Write an SQL query to clone a new table from another table.*/
use commpany_data1;
drop table worker_clone;
create table worker_clone as select * from worker;