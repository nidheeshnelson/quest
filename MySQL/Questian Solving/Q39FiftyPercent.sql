/*Q-39. Write an SQL query to fetch the first 50% records from a table.*/
use commpany_data1;
select * from worker limit(select floor (0.5*count(*)) from worker);
select top 50 percent * from worker;
select 0.5*count(*) from worker;