/*14. Write the query to get the department and department wise total(sum) salary from*/
use companypraject;
select Department, sum(Salary) as Total_Salary from employee_details group by Department;