/*Q-4. Write an SQL query to print the first three characters of  FIRST_NAME from Worker table.*/
use commpany_data1;
select substring(FIRST_NAME,1,3) from worker;
