/* Write your MySQL query statement below */

/* todo 关于in 和exist 的区别 https://blog.csdn.net/baidu_37107022/article/details/77278381


select C.Name Customers from Customers C where c.Id not in (select  CustomerId from Orders )

select t1.name as Customers from Customers t1 where not EXISTS (select CustomerId from Orders t2 where t1.id=t2.CustomerId)