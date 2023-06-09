package com.bridgelabz.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AddressBookMain {
    Connection connection;

    private Connection getConnection() {
        String URL_JD = "jdbc:mysql://localhost:3306/AddressBookService";
        String USER_NAME = "root";
        String PASSWORD = "Password@123";
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers loaded!!");
            connection = DriverManager.getConnection(URL_JD,USER_NAME,PASSWORD);
            System.out.println("connection Established!!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


    public List<ContactsData> retrieveData() {
        ResultSet resultSet = null;
        List<ContactsData> addressBookList = new ArrayList<ContactsData>();
        try (Connection connection = getConnection()) {
            Statement statement = connection.createStatement();
            String sql = "select * from address_book";
            resultSet = statement.executeQuery(sql);
            int count = 0;
            while (resultSet.next()) {
            	ContactsData contactInfo = new ContactsData();
                contactInfo.setFirstName(resultSet.getString("firstName"));
                contactInfo.setLastName(resultSet.getString("Lastname"));
                contactInfo.setAddress(resultSet.getString("address"));
                contactInfo.setCity(resultSet.getString("city"));
                contactInfo.setState(resultSet.getString("state"));
                contactInfo.setZip(resultSet.getInt("zip"));
                contactInfo.setPhoneNumber(resultSet.getString("phoneNumber"));
                contactInfo.setEmailId(resultSet.getString("email"));
                contactInfo.setBookName(resultSet.getString("bookName"));
                contactInfo.setContactType(resultSet.getString("contactType"));
                contactInfo.setDateAdded(resultSet.getDate("Date_added").toLocalDate());

                addressBookList.add(contactInfo);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return addressBookList;

    }
}