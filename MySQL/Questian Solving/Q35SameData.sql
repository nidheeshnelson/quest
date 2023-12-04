/*Q-35. Write an SQL query to fetch the list of employees with the same salary.*/
use commpany_data1;
select concat(FIRST_NAME,' ',LAST_NAME) as Employeee_Name, SALARY 
from worker group by SALARY having count(SALARY)>1;