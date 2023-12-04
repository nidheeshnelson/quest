/*Q-27. Write an SQL query to show only even rows from a table.*/
use commpany_data1;
select * from worker where mod(WORKER_ID,2)=0;