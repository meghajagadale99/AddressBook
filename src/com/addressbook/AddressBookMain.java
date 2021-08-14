package com.addressbook;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);
    static AddressBookInfo contactActivity = new AddressBookInfo();
    static HashMap<String, ArrayList<Contacts>> contactDict = new HashMap<>();
    static AddressBookMain addressBook = new AddressBookMain();
    static ArrayList<Contacts> contactList = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Welcome to the Address book program"); // Welcome statement
        addressBook.addContactList();
    }

    public void addAddressBook() {
        System.out.println("Enter address book name :");
        String addressBookName = sc.next();
        ArrayList<Contacts> contactList = new ArrayList<>();
        contactDict.put(addressBookName, contactList);
    }

    public ArrayList selectAddressBook() {
        System.out.println("Enter the name of address book");
        String name = sc.nextLine();
        if (contactDict.containsKey(name)) {
            ArrayList<Contacts> contact = contactDict.get(name);
            return contact;
        }
        System.out.println("not found");
        return null;
    }

    public void displayList() {
        for (Entry<String, ArrayList<Contacts>> m : contactDict.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    public void addContactList() {
        int option = 0;
        while (option != 3) {
            System.out.println("Press 0 - Display all address books");
            System.out.println("Press 1 - Add new address book");
            System.out.println("Press 2 - Access address book");
            System.out.println("Press 3 - Exit");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 0 -> displayList();
                case 1 -> addressBook.addAddressBook();
                case 2 -> {
                    addressBook.selectAddressBook();
                    System.out.println("Press 0 - Display all contacts");
                    System.out.println("Press 1 - Add contact");
                    System.out.println("Press 2 - Edit contact");
                    System.out.println("Press 3 - Delete contact");
                    System.out.println("Enter choice");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 0 -> contactActivity.display(contactList);
                        case 1 -> contactActivity.addContact(contactList);
                        case 2 -> contactActivity.editContact(contactList);
                        case 3 -> contactActivity.deleteContact(contactList);
                    }
                }
            }
        }
    }
}