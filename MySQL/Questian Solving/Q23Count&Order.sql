/*Q-23. Write an SQL query to fetch the no. of workers for each department in the descending order.*/
use commpany_data1;
select DEPARTMENT, count(*) as WORKER_COUNT from worker group by DEPARTMENT order by WORKER_COUNT desc;
