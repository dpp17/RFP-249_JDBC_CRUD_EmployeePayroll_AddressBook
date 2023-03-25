create table EmployeeDepartment(
EmployeeID int auto_increment primary key,
DepartmentID int not null,
Department varchar(45) 
);
insert into EmployeeDepartment(EmployeeID, DepartmentID, Department) values
(1,02,'Admin'),
(2,03,'Engg'),
(3,01,'Doc'),
(4,02,'Admin'),
(5,03,'Engg'),
(6,01,'Doc'),
(7,04,'Accounts'),
(15,05,'Sales'),
(16,06,'Marketing')
;
select * from EmployeeDepartment;

#total and average netpay of females
select avg(NetPay) as Average_pay, sum(NetPay) as Total_pay from employee_payroll where Gender = 'F' group by Gender;

#total and average netpay of males
select avg(NetPay) as Average_pay, sum(NetPay) as Total_pay from employee_payroll where Gender = 'M' group by Gender;

#minimum salary
select * from employee_payroll where NetPay = (select min(NetPay) as minimum_pay from employee_payroll);

#maximum salary
select * from employee_payroll where NetPay = (select max(NetPay) as minimum_pay from employee_payroll);

select count(EmployeeID) as Total_Employees from employee_payroll;
