/*Write query for combine FirstName and LastName and display it as
"Name" (also include white space between first name & last name)*/
use companypraject;
select concat(FirstName,' ', LastName) as Name from employee_details;
