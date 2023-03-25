package com.bridgelabz.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class AddressBookService {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean exit = false;
        while (!exit) {
            System.out.println(" Press\n 1 ->  Retrieve data\n 2 -> Update Address,city,state,zip  by srNo\n " +
                    "3 Retrieve data for particular date" +
                    "-> \n 4 -> exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    retrieveData();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    reteriveDataForParticularDate();
                    break;
                case 4:
                    exit = true;
            }
        }
    }

    private static void retrieveData() {
        AddressBookMain addressBookRepo = new AddressBookMain();
        List<ContactsData> employeeInfoList = addressBookRepo.retrieveData();
        for (ContactsData employee : employeeInfoList
        ) {
            System.out.println(employee + "\n");
        }
    }

    private static void update() {
        AddressBookMain addressBookRepo = new AddressBookMain();
        System.out.println("Enter the address,city,state, zip and Serial Number  to Update");
        addressBookRepo.updateCityByZip(scanner.next(), scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt());
    }
    private static void reteriveDataForParticularDate() {
        AddressBookMain addressBookRepo = new AddressBookMain();
        System.out.println("Enter the Date of Joining (YYYY-MM-DD");
        System.out.println("Enter year , month and Day ex: 2020 02 03");
        List<ContactsData> employeeInfoList = addressBookRepo.findAllForParticularDate(LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        for (ContactsData employee : employeeInfoList
        ) {
            System.out.println(employee + "\n");
        }
    }
}