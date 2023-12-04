/*Q-5. Write an SQL query to find the position of the alphabet (‘a’) in the first name column ‘Amitabh’ from Worker
 table.*/
 use commpany_data1;
select position('a' in FIRST_NAME)
from worker 
where FIRST_NAME = 'Amitabh';