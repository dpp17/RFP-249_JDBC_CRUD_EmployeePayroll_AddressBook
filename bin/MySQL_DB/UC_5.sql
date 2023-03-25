select NetPay from employee_payroll where EmployeeName = 'Amitabh';
select EmployeeName, NetPay from employee_payroll where StartDate between cast('2015-01-01' as date) and date(now()); 