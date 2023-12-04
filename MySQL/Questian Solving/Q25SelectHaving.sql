/*Q-25. Write an SQL query to fetch duplicate records having matching data in some fields of a table.*/
use commpany_data1;
select * from bonus group by WORKER_REF_ID having count(WORKER_REF_ID)>1;