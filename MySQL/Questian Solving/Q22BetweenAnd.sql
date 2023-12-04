/*Q-22. Write an SQL query to fetch worker names with salaries >= 50000 and <= 100000.*/
use commpany_data1;
select * from worker where SALARY between 49999 and 100001;
select concat(FIRST_NAME,' ',LAST_NAME) as COMPLETE_NAME from worker where SALARY between 49999 and 100001;
