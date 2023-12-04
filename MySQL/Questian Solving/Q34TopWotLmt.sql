/*Q-34. Write an SQL query to determine the 5th highest salary without using TOP or limit method.*/
use commpany_data1;
select distinct SALARY from worker t1 
where 5=(select count(distinct SALARY) from worker t2 where t2.SALARY >= t1.SALARY);
