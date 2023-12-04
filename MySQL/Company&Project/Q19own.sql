/*19. Get employee name, project name order by firstname from "EmployeeDetail" and
"ProjectDetail" for those employee which have assigned project already.*/
use companypraject;
select concat(employee_details.FirstName,' ',employee_details.LastName) as Name,
projectdetails.ProjectName
from employee_details
join projectdetails on employee_details.EmpId = projectdetails.empID;


