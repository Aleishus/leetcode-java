
select d.Name Department ,a.Name Employee,a.Salary from Employee a, Department d where (select count(distinct b.Salary) from Employee b where  a.DepartmentId = b.DepartmentId
and a.Salary<b.Salary ) <3 and a.DepartmentId=d.Id order by a.DepartmentId,a.Salary desc;

/*使用自变量*/

# Write your MySQL query statement below
select c.name Department,a.name Employee,a.salary Salary from (
    select Name,
    @num:= IF(@dept_id=DepartmentId,IF(@salary=salary,@num,@num+1),1)  num,
    @dept_id:=DepartmentId  DepartmentId,
    @salary:=salary Salary
    from Employee,
    (select @dept_id:=0,@num:=0,@salary:=0) b
    order by DepartmentId asc,Salary desc
) a
join Department c on c.id=a.DepartmentId
where num<=3;


/*todo 请类比178 求分组top N 问题*/