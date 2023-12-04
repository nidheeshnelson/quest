/*Q-24. Write an SQL query to print details of the Workers who are also Managers.*/
use commpany_data1;
select * from title where WORKER_TITLE in ('Manager');