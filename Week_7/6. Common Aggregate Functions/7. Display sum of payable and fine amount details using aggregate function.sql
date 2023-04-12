SELECT SUM(payable_amount + fine_amount) AS sum_payable_and_fine_amount
FROM bill
WHERE fine_amount>0;
