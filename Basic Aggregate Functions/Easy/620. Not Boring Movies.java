# Write your MySQL query statement below
SELECT *
From Cinema
WHERE mod(id,2)=1 AND description !='boring'
ORDER BY rating DESC;
