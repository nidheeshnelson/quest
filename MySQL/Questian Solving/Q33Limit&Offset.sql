/*Q-33. Write an SQL query to determine the nth (say n=5) highest salary from a table.*/
use commpany_data1;
select distinct SALARY from worker order by  SALARY desc limit 1 offset 4;