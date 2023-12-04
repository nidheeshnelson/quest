/*21. Write a query to find out the project name which is not assigned to any employee*/
use companypraject;
select projectdetails.ProjectName 
from projectdetails
left join employee_details on employee_details.EmpId=projectdetails.empID
where projectdetails.projectID is null;