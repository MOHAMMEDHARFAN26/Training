use classicmodels;
describe customers;
ALTER TABLE customers ADD dob date;
select * from customers;
alter table customers drop column dob;
select * from customers where (contactLastName = 'Brown' AND country = 'USA');
select salesRepEmployeeNumber AS EmpNumber from customers;
SELECT AVG(phone) FROM customers;
select * from customers where customerNumber between 100 AND 120;
SELECT CustomerName, City, Country FROM Customers ORDER BY (CASE WHEN City IS NULL THEN Country ELSE City END);
select count(phone) from customers;
select city, count(*) from customers group by city;
SELECT COUNT(customerNumber), country FROM customers GROUP BY country HAVING COUNT(customerNumber) > 5;
select employees.employeeNumber, customers.customerNumber from employees inner join customers on employees.firstName = customers.contactFirstName;
SELECT state FROM customers WHERE state IS NULL;
SELECT contactLastName FROM customers WHERE state LIKE contactFirstName;
SELECT customerNumber FROM customers LIMIT 30;
SELECT MAX(customerNumber) FROM customers;
SELECT MIN(customerNumber) FROM customers;
select customerNumber from customers where customerNumber = 103 OR customerNumber=151;
SELECT city FROM customers ORDER BY city ASC;
SELECT city FROM customers ORDER BY city DESC;
select customerNumber from customers left join employees on customers.contactFirstName = employees.firstName;
SELECT DISTINCT city FROM customers;
SELECT customerNumber
FROM customers
UNION
SELECT employeeNumber
FROM employees;
SELECT city,country,
REPLACE(country,'US','SA') 
FROM customers 
WHERE country='USA';
