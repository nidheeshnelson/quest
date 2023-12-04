/* Select from both tables students and marksnp*/
use collage;
select students.S_Name, marksnp.Bio from students inner join marksnp on S_ID = M_ID;
