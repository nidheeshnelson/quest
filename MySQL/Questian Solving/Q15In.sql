/*Q-15. Write an SQL query to print details of Workers with DEPARTMENT name as “Admin”.*/
use commpany_data1;
select * from worker where DEPARTMENT in('Admin');