# Write your MySQL query statement below
SELECT
    DISTINCT SalesPerson.name AS name
FROM Orders
INNER JOIN Company ON (Company.com_id = Orders.com_id AND Company.name = 'RED')
RIGHT JOIN SalesPerson ON Orders.sales_id = SalesPerson.sales_id
WHERE Company.name IS NULL 
;