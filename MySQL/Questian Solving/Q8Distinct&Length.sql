/*Q-8. Write an SQL query that fetches the unique values of DEPARTMENT from Worker table and prints its length.*/
use commpany_data1;
select distinct DEPARTMENT, length(DEPARTMENT) from worker;