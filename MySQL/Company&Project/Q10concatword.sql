/*10. Select first name from "EmployeeDetail" table prifixed with "Hello "*/
use companypraject;
select concat('Hello ',FirstName,' ',LastName) as Greetings from employee_details;