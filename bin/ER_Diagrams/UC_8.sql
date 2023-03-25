alter table employee_payroll add PhoneNumber varchar(100);
alter table employee_payroll add Address varchar(255) default "IAF adampur";
alter table employee_payroll add Department varchar(100) not null;


update employee_payroll set PhoneNumber = 98723404789, Address = "flat no. 111, sai baba colony goregaon east", Department = "Admin" where EmployeeID = 1;
update employee_payroll set PhoneNumber = 98773404789, Address = "flat no. 121, sai baba colony east", Department = "Engg" where EmployeeID = 2;
update employee_payroll set PhoneNumber = 7777404789, Address = "flat no. 323, sai baba colony goregaon ", Department = "Doc" where EmployeeID = 3;
update employee_payroll set PhoneNumber = 7877404789, Address = "flat no. 211, sai baba gorgia complex gaon east", Department = "Admin" where EmployeeID = 4;
update employee_payroll set PhoneNumber = 7177404789, Address = "flat no. 663, sai ram colony ", Department = "Engg" where EmployeeID = 5;
update employee_payroll set PhoneNumber = 9911234789, Address = default, Department = "Doc" where EmployeeID = 6;
update employee_payroll set PhoneNumber = 9132177401, Address = "flat no. 89, ramdir complex washepur", Department = "Accounts" where EmployeeID = 7;
