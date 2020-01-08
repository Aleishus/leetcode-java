select d.Name Department,e.Name Employee,e.Salary

 from Employee e,Department d ,

 (select max(Salary) maxSalary,DepartmentId  from Employee   group by DepartmentId ) m

where  e.Salary = m.maxSalary and e.DepartmentId=m.DepartmentId and e.DepartmentId =  d.Id


/*官方例子*/
SELECT
    Department.name AS 'Department',
    Employee.name AS 'Employee',
    Salary
FROM
    Employee
        JOIN
    Department ON Employee.DepartmentId = Department.Id
WHERE
    (Employee.DepartmentId , Salary) IN
    (   SELECT
            DepartmentId, MAX(Salary)
        FROM
            Employee
        GROUP BY DepartmentId
	)
;
