/*17. Get department wise maximum salary from "EmployeeDetail" 
table order by salary ascending*/
use companypraject;
select Department, sum(Salary) as Total_Salary from employee_details 
group by Department
order by Total_Salary asc;
