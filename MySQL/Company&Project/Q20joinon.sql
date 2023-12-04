/*20. Get employee name, project name order by firstname from "EmployeeDetail" and 
"ProjectDetail" for all employee even they have not assigned project.*/
use companypraject;
select employee_details.FirstName, projectdetails.ProjectName 
from employee_details 
join projectdetails 
on employee_details.EmpId=projectdetails.empID;