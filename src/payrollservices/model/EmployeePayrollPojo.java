package payrollservices.model;

import java.sql.Date;

public class EmployeePayrollPojo {

	private int employeeID;
	private String employeeName;
	private char gender;
	private int netPay;
	private String startDate;
	private String city;
	private String country;
	private long phoneNumber;
	private String address;
	private String department;
	private int basicPay;
	private int deductions;
	private int taxAblePay;
	private int tax;
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getNetPay() {
		return netPay;
	}
	public void setNetPay(int netPay) {
		this.netPay = netPay;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(int basicPay) {
		this.basicPay = basicPay;
	}
	public int getDeductions() {
		return deductions;
	}
	public void setDeductions(int deductions) {
		this.deductions = deductions;
	}
	public int getTaxAblePay() {
		return taxAblePay;
	}
	public void setTaxAblePay(int taxAblePay) {
		this.taxAblePay = taxAblePay;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public String toString() {
		return "EmployeePayrollPojo [employeeID=" + employeeID + ", employeeName=" + employeeName + ", gender=" + gender
				+ ", netPay=" + netPay + ", startDate=" + startDate + ", city=" + city + ", country=" + country
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + ", department=" + department + ", basicPay="
				+ basicPay + ", deductions=" + deductions + ", taxAblePay=" + taxAblePay + ", tax=" + tax + "]";
	}
	
	

}
