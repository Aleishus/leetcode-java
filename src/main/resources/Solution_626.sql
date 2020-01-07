# Write your MySQL query statement below


select
(case
 when id % 2=0 then id-1
 when id % 2=1 AND id !=counts then id+1 else id end) id,student from seat,(select count(*) counts from seat) m order by id asc


select IF(id%2=1,IF(id+1>a.m,id,id+1),id-1) id ,student from seat,(select count(*) m from seat ) a order by id