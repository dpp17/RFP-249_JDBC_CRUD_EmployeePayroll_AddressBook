package payrollservices.connections;

import java.sql.*;

import payrollservices.model.EmployeePayrollPojo;

public class PayrollServicesJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		EmployeePayrollPojo pojo = new EmployeePayrollPojo();
		
		Class.forName("com.mysql.jdbc.Driver");
		final String url = "jdbc:mysql://localhost:3306/payroll_service";
		final String userName = "root";
		final String password = "Lambop@12345";
		Connection connection = DriverManager.getConnection(url,userName,password);
		Statement statement = connection.createStatement();
		
		//adding new employee 
		String queryInsert = "insert into employee_payroll (EmployeeName,NetPay,StartDate,City,Country,Address,Department,BasicPay,Deductions,TaxablePay,Tax)"
				+ " values (?,?,?,?,?,?,?,?,?,?,?);";
		
		PreparedStatement statementIn = connection.prepareStatement(queryInsert);
		statementIn.setString(1, pojo.getEmployeeName());
		statementIn.setInt(2, pojo.getNetPay());
		statementIn.setString(3, pojo.getStartDate());
		statementIn.setString(4, pojo.getCity());
		statementIn.setString(5, pojo.getCountry());
		statementIn.setString(6, pojo.getAddress());
		statementIn.setString(7, pojo.getDepartment());
		statementIn.setInt(8, pojo.getBasicPay());
		statementIn.setInt(9, pojo.getDeductions());
		statementIn.setInt(10, pojo.getTaxAblePay());
		statementIn.setInt(11, pojo.getTax());
		
		int confirm = statementIn.executeUpdate();
		System.out.println(confirm==1? "Added ":" Error while Adding ");
		statement.close();
		connection.close();

		//adding new employee to payroll detail 
		String queryInsertTwo = "insert into payroll_detail (EmployeeName,NetPay,StartDate,City,Country,Address,Department,BasicPay,Deductions,TaxablePay,Tax)"
				+ " values (?,?,?,?,?,?,?,?,?,?,?);";
		
		PreparedStatement statementInTwo = connection.prepareStatement(queryInsert);
		statementIn.setString(1, pojo.getEmployeeName());
		statementIn.setInt(2, pojo.getNetPay());
		statementIn.setString(3, pojo.getStartDate());
		statementIn.setString(4, pojo.getCity());
		statementIn.setString(5, pojo.getCountry());
		statementIn.setString(6, pojo.getAddress());
		statementIn.setString(7, pojo.getDepartment());
		statementIn.setInt(8, pojo.getBasicPay());
		statementIn.setInt(9, pojo.getDeductions());
		statementIn.setInt(10, pojo.getTaxAblePay());
		statementIn.setInt(11, pojo.getTax());
		
		int confi = statementIn.executeUpdate();
		System.out.println(confi==1? "Added ":" Error while Adding ");
		statement.close();
		connection.close();
		
		//total and average netpay of female
		String queryOne = "select avg(NetPay) as Average_pay, sum(NetPay) as Total_pay from employee_payroll where Gender = 'F' group by Gender; ";
		
		ResultSet resultSetOne = statement.executeQuery(queryOne);
		while(resultSetOne.next()) {
			int Average_pay = resultSetOne.getInt("Average_pay");
			int Total_pay = resultSetOne.getInt("Total_pay");
			System.out.println(" Females :: ");
			System.out.println("Average_pay :: " + Average_pay + '\n'+
					" Total_pay :: " + Total_pay);
		}
		
		//total and average netpay of males
		String queryTwo = "select avg(NetPay) as Average_pay, sum(NetPay) as Total_pay from employee_payroll where Gender = 'M' group by Gender; ";

		ResultSet resultSetTwo = statement.executeQuery(queryTwo);
		while(resultSetTwo.next()) {
			int Average_pay = resultSetTwo.getInt("Average_pay");
			int Total_pay = resultSetTwo.getInt("Total_pay");
			System.out.println('\n'+" Males :: ");
			System.out.println("Average_pay :: " + Average_pay + '\n'+
					" Total_pay :: " + Total_pay);
		}
		
		//minimum
		String queryThree = "select * from employee_payroll where NetPay = (select min(NetPay) as minimum_pay from employee_payroll); ";

		ResultSet resultSetThree = statement.executeQuery(queryThree);
		while(resultSetThree.next()) {
			//int employeeID = resultSet.getInt("EmployeeID");
			String employeeName = resultSetThree.getString("EmployeeName");
			int netPay = resultSetThree.getInt("NetPay");
			String startDate = resultSetThree.getString("StartDate");
			String city = resultSetThree.getString("City");
			String country = resultSetThree.getString("Country");
			String address = resultSetThree.getString("Address");
			String department = resultSetThree.getString("Department");
			int basicPay = resultSetThree.getInt("BasicPay");
			int deductions = resultSetThree.getInt("Deductions");
			int taxAblePay = resultSetThree.getInt("TaxablePay");
			int tax = resultSetThree.getInt("Tax");
			
			System.out.println('\n'+" Minimum salary :: ");
			System.out.println("employeeID=" + ", employeeName=" + employeeName
				+ ", netPay=" + netPay + ", startDate=" + startDate + ", city=" + city + ", country=" + country
				+ ", address=" + address + ", department=" + department + ", basicPay="
				+ basicPay + ", deductions=" + deductions + ", taxAblePay=" + taxAblePay + ", tax=" + tax);
			
		}
		
		//maximum
		String queryFour = "select * from employee_payroll where NetPay = (select max(NetPay) as minimum_pay from employee_payroll);";
	
		ResultSet resultSetFour = statement.executeQuery(queryFour);
		while(resultSetFour.next()) {
			String employeeName = resultSetFour.getString("EmployeeName");
			int netPay = resultSetFour.getInt("NetPay");
			String startDate = resultSetFour.getString("StartDate");
			String city = resultSetFour.getString("City");
			String country = resultSetFour.getString("Country");
			String address = resultSetFour.getString("Address");
			String department = resultSetFour.getString("Department");
			int basicPay = resultSetFour.getInt("BasicPay");
			int deductions = resultSetFour.getInt("Deductions");
			int taxAblePay = resultSetFour.getInt("TaxablePay");
			int tax = resultSetFour.getInt("Tax");
			
			System.out.println('\n'+" Maximum salary :: ");
			System.out.println("employeeID=" + ", employeeName=" + employeeName
				+ ", netPay=" + netPay + ", startDate=" + startDate + ", city=" + city + ", country=" + country
				+ ", address=" + address + ", department=" + department + ", basicPay="
				+ basicPay + ", deductions=" + deductions + ", taxAblePay=" + taxAblePay + ", tax=" + tax);
			
		}
		
		//count
		String queryFive = "select count(EmployeeID) as Total_Employees from employee_payroll; ";
		
		ResultSet resultSetFive = statement.executeQuery(queryFive);
		while(resultSetFive.next()) {
			int Total_Employees = resultSetFive.getInt("Total_Employees");
			System.out.println('\n' + " Count Of Total Employees");
			System.out.println(" Total_Employees :: " + Total_Employees);
		}

		
		statement.close();
		connection.close();
		

	}

}
//PreparedStatement statement = connection.prepareStatement(query);
//statement.setInt(1, employeePojo.getNetPay());
//statement.setString(2, employeePojo.getEmployeeName());
//int res = statement.executeUpdate();
//System.out.println(res+" :: records inserted");