/*Q-20. Write an SQL query to print details of the Workers who have joined in Feb’2014.*/
use commpany_data1;
select * from worker where month(JOINING_DATE)=2 and year(JOINING_DATE)=2014;