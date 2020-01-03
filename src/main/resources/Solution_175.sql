select A.FirstName, A.LastName, B.City, B.State from Person A left join (
select distinct PersonId, City, State from Address) B
on A.PersonId = B.PersonId;
/*todo join 前先对被join的表去重，效率会高很多*/