# Write your MySQL query statement below

select distinct t1.Num ConsecutiveNums from Logs t1,Logs t2,Logs t3 where t1.id+1=t2.id and t2.id+1=t3.id and
t1.Num = t2.Num and t2.Num = t3.Num

/*todo  也可以使用自变量的写法 更高效*/
select distinct Num as ConsecutiveNums from (select Num, if(@pre =@pre:=Num,@cou := @cou+1,@cou :=1) as cou from logs l,(select @pre:=-1,@cou:=1) a) n where n.cou > 2