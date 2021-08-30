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
    private int haveContact(String s) {
        for (int i=0; i < contactList.size(); i++)
            if (contactList.get(i).getFirstName().equals(s))
                return i;
        return -1;
    }
    public void deleteContact(String s) {
        int place = haveContact(s);
        if (place >= 0)
            contactList.remove(place);
    }
}
