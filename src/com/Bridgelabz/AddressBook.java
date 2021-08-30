package com.Bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    private ArrayList<Contactbook> contactList; //An array of contacts

    //creating an empty AddressBook
    public AddressBook() {
        contactList = new ArrayList<Contactbook>();
    }

    //Add a contact that's passed in as a parameter
    public void addContact(Contactbook c) {
        contactList.add(c);
    }
}
