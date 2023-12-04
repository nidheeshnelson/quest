/*Q-7. Write an SQL query to print the DEPARTMENT from Worker table after removing white spaces from the left side.*/
use commpany_data1;
select ltrim(DEPARTMENT) from worker;