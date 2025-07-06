-- /* Write your T-SQL query statement below */
-- SELECT TOP(1) 
-- customer_numer ,
-- COUNT(customer_number) AS total_count
-- FROM Orders
-- GROUP BY customer_number
-- ORDER BY total_count DESC

SELECT TOP 1 
    customer_number
FROM Orders
GROUP BY customer_number
ORDER BY COUNT(customer_number) DESC;
