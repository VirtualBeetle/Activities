SELECT AVG(payable_amount) AS average_payable_amount 
FROM bill
WHERE payable_amount>10000;
