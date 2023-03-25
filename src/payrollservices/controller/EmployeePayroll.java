package payrollservices.controller;

import java.util.Scanner;

import payrollservices.model.EmployeePayrollPojo;

public class EmployeePayroll {

	private static Scanner userInput = new Scanner(System.in);
	
	public static EmployeePayrollPojo getDetails() {
		EmployeePayrollPojo employeePojo = new EmployeePayrollPojo();
		
		System.out.println("Enter Employee Name");
		employeePojo.setEmployeeName(userInput.next());
		
//		System.out.println("Enter gender");
//		employeePojo.setGender(userInput.next().charAt(0));
		
		System.out.println("Enter netPay");
		employeePojo.setNetPay(userInput.nextInt());
//		
//		System.out.println("Enter startDate");
//		employeePojo.setStartDate(userInput.next());
//		
//		System.out.println("Enter city");
//		employeePojo.setCity(userInput.next());
//		
//		System.out.println("Enter country");
//		employeePojo.setCountry(userInput.next());
//		
//		System.out.println("Enter phoneNumber");
//		employeePojo.setPhoneNumber(userInput.nextLong());
//		
//		System.out.println("Enter department");
//		employeePojo.setDepartment(userInput.next());
//		
//		System.out.println("Enter basicPay");
//		employeePojo.setBasicPay(userInput.nextInt());
//		
//		System.out.println("Enter deductions");
//		employeePojo.setDeductions(userInput.nextInt());
//		
//		System.out.println("Enter taxAblePay");
//		employeePojo.setTaxAblePay(userInput.nextInt());
//		
//		System.out.println("Enter tax");
//		employeePojo.setTax(userInput.nextInt());
//		
//		System.out.println("Enter address");
//		employeePojo.setAddress(userInput.next());
		
		return employeePojo;
	}

}
