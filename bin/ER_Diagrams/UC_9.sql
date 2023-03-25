alter table employee_payroll add BasicPay float;
alter table employee_payroll add Deductions float;
alter table employee_payroll add TaxablePay float;
alter table employee_payroll add  Tax float;

update employee_payroll set BasicPay = 3200000, Deductions = 1200000, TaxablePay = 50000, Tax =55000 where EmployeeID = 1;
update employee_payroll set BasicPay = 4200000, Deductions = 100000, TaxablePay = 50000, Tax =6000 where EmployeeID = 2;
update employee_payroll set BasicPay = 3340000, Deductions = 1200000, TaxablePay = 50000, Tax =55000 where EmployeeID = 3;
update employee_payroll set BasicPay = 2200000, Deductions = 700000, TaxablePay = 30000, Tax =25000 where EmployeeID = 4;
update employee_payroll set BasicPay = 6800000, Deductions = 200000, TaxablePay = 70000, Tax =65000 where EmployeeID = 5;
update employee_payroll set BasicPay = 6200000, Deductions = 1200000, TaxablePay = 50000, Tax =55000 where EmployeeID = 6;
update employee_payroll set BasicPay = 4200000, Deductions = 1200000, TaxablePay = 50000, Tax =55000 where EmployeeID = 7;

select * from employee_payroll;