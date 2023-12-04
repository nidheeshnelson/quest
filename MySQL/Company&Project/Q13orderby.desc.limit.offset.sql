/*13. Select second highest salary from "EmployeeDetail" table*/
use companypraject;
select Salary as Second_Highest_Salary from employee_details order by Salary desc limit 1 offset 1;