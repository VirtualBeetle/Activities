SELECT SUM(payable_amount) AS sum_payable_amount
FROM bill
WHERE YEAR(payment_date) = 2018;
