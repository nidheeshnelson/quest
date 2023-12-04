/*18. Write down the query to fetch Project name assign to more than one Employee*/
use companypraject;
select * from projectdetails;
update projectdetails set ProjectName = 'software1' where ProjectID = 'P3';