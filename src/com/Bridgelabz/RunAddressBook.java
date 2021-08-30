package com.Bridgelabz;

import java.util.Scanner;

public class RunAddressBook {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        //Instantiate AddressBook object
        AddressBook contactList = new AddressBook();

        menu();
        int choice = stdin.nextInt();
        while (choice != 5) {

            if (choice == 1) {
                System.out.println("Enter first name: ");
                String firstName = stdin.next();
                System.out.println("Enter last name: ");
                String lastName = stdin.next();
                System.out.println("Enter address: ");
                String address = stdin.next();
                System.out.println("Enter city name: ");
                String city = stdin.next();
                System.out.println("Enter state name: ");
                String state = stdin.next();
                System.out.println("Enter zipcode: ");
                int zip = stdin.nextInt();
                System.out.println("Enter phone number: ");
                long phone = stdin.nextLong();
                System.out.println("Enter Email ID: ");
                String email = stdin.next();

                contactList.addContact(new Contactbook(firstName, lastName, address, city, state, zip, phone, email));

                menu();
                choice = stdin.nextInt();
            } else if (choice == 2) {
                System.out.println("what is the first name of the contact yo want to delete: ");
                String firstname = stdin.next();
                contactList.deleteContact(firstname);
            } else
                System.out.println("sorry, unable to create/add your contact.");
        }
    }

    public static void menu() {
        System.out.println("1.Add a new contact to your address book.");
        System.out.println("2.Delete an Existing contact to your address book.");
        System.out.println("3.print out information of contacts in your address book.");
        System.out.println("4.print out no.of contacts you have.");
        System.out.println("5.Quit.");
        System.out.println("Enter your choice: ");
    }
}
