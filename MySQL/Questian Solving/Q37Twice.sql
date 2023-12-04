/*Q-37. Write an SQL query to show one row twice in results from a table*/
use commpany_data1;
select * from worker where condition 
union all
select * from worker where condition and 1=1;