# Write your MySQL query statement below

 #delete from Person where Id in (select * from (select t1.Id from Person t1,Person t2 where t1.Id>t2.Id and
 #t1.Email = t2.Email) A)
 delete t1  from Person t1,Person t2 where t1.Id>t2.Id and t1.Email = t2.Email

 /*todo delete 也可以进行多表*/