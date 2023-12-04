/*Q-26. Write an SQL query to show only odd rows from a table.*/
use commpany_data1;
select * from worker where mod(WORKER_ID,2)=1;