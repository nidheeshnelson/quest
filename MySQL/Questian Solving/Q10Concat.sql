/*Q-10. Write an SQL query to print the FIRST_NAME and LAST_NAME from Worker table into a single column COMPLETE_NAME. A space char should separate them.*/
use commpany_data1;
select concat(FIRST_NAME,' ',LAST_NAME) as COMPLETE_NAME from worker;