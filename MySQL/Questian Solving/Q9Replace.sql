/*Q-9. Write an SQL query to print the FIRST_NAME from Worker table after replacing ‘a’ with ‘A’.
Ans.*/
use commpany_data1;
select replace (FIRST_NAME,'a','A') from worker;
