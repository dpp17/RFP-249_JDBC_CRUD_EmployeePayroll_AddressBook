package com.bridgelabz.service;

import java.util.List;
import java.util.Scanner;

public class AddressBookService {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean exit = false;
        while (!exit) {
            System.out.println(" Press\n 1 ->  Retrieve data\n 2 -> Exit");
            switch (scanner.nextInt()) {
                case 1:
                    retrieveData();
                    break;
                case 2:
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

    private static void updateCity() {
        AddressBookMain addressBookRepo = new AddressBookMain();
        System.out.println("Enter the address,city,state, zip and Serial Number  to Update");
        addressBookRepo.updateCityByZip(scanner.next(), scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt());
    }
}