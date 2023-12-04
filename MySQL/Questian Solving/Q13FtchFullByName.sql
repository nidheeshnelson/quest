/*Q-13. Write an SQL query to print details for Workers with the first name as “Vipul” and “Satish” from Worker table.*/
use commpany_data1;
select * from worker where FIRST_NAME in('Vipul','Satish');