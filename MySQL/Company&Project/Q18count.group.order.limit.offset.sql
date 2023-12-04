/*18. Write down the query to fetch Project name assign to more than one Employee*/
use companypraject;
select ProjectName, count(ProjectName) as Project_Count 
from projectdetails 
group by ProjectName
order by Project_Count desc limit 1 offset 0;
