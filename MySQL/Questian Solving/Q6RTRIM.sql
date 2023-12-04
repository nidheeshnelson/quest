/*Q-6. Write an SQL query to print the FIRST_NAME from Worker table after removing white spaces from the right side.*/
use commpany_data1;
select rtrim(FIRST_NAME) from worker;