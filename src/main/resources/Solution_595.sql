# Write your MySQL query statement below
select name ,population,area from World where population > 25000000 or area> 3000000

/*todo  也可使用union */
SELECT
    name, population, area
FROM
    world
WHERE
    area > 3000000

UNION

SELECT
    name, population, area
FROM
    world
WHERE
    population > 25000000
;

