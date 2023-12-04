/*Q-36. Write an SQL query to show the second highest salary from a table.*/
use commpany_data1;
select distinct SALARY from worker order by SALARY desc limit 1 offset 1;