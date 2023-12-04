/*Q-21. Write an SQL query to fetch the count of employees working in the department ‘Admin’.*/
use commpany_data1;
select count(*) from worker where DEPARTMENT = 'Admin';
