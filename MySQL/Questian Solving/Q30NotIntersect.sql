/*Q-30. Write an SQL query to show records from one table that another table does not have.*/
use commpany_data1;
select * from worker where WORKER_ID not in(select WORKER_REF_ID from bonus);