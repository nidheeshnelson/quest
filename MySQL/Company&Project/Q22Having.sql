/*22. Write down the query to fetch EmployeeName & Project who has assign more than one 
project*/
use companypraject;
select employee_details.FirstName, projectdetails.ProjectName
from employee_details
join projectdetails on employee_details.EmpId=projectdetails.empID
group by employee_details.FirstName, projectdetails.ProjectName
having count(employee_details.EmpId)>1;