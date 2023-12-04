/*Q-14. Write an SQL query to print details of workers excluding first names, “Vipul” and “Satish” from Worker table.*/
use commpany_data1;
select * from worker where FIRST_NAME not in('Vipul','Satish');