/*Write your MySQL query statement below*/

select A.Id from Weather A , Weather B where A.RecordDate = date_add(B.RecordDate,INTERVAL 1 DAY) and
 A.Temperature >  B.Temperature