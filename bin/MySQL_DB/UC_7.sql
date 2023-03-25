#total and average netpay of females
select avg(NetPay) as Average_pay, sum(NetPay) as Total_pay from employee_payroll where Gender = 'F' group by Gender;

#total and average netpay of males
select avg(NetPay) as Average_pay, sum(NetPay) as Total_pay from employee_payroll where Gender = 'M' group by Gender;

#minimum salary
select * from employee_payroll where NetPay = (select min(NetPay) as minimum_pay from employee_payroll);

#maximum salary
select * from employee_payroll where NetPay = (select max(NetPay) as minimum_pay from employee_payroll);

select count(EmployeeID) as Total_Employees from employee_payroll;