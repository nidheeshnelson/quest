/*Q-38. Write an SQL query to fetch intersecting records of two tables.*/
use commpany_data1;
select * from worker where WORKER_ID
in
(select WORKER_REF_ID from title); 