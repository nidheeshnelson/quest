/*16. Write the query to get the department, total no. of departments, total(sum) salary with
respect to department from "EmployeeDetail" table.*/
use companypraject;
select Department, count(Department) as Total_Dep,sum(Salary) as Total_Salary 
from employee_details 
group by Department
order by Total_Salary desc;