/*8. Select all employee detail with First name "Vikas","Ashish", and "Nikhil"*/
use companypraject;
select * from employee_details where FirstName in ('vikas', 'ashish', 'nikhil');