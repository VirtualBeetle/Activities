SELECT SUM(payable_amount) AS sum_payable_amount
FROM bill
WHERE due_date = '2017-10-01';
