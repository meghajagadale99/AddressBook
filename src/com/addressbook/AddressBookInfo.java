package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookInfo {
    static Scanner sc = new Scanner(System.in);

    public void addContact(ArrayList<Contacts> contactList) {

        Contacts contact = new Contacts();

        System.out.println("Enter first name : ");
        contact.firstName = sc.next();

        System.out.println("Enter last name : ");
        contact.lastName = sc.next();

        System.out.println("Enter address : ");
        contact.address = sc.nextLine();
        sc.next();

        System.out.println("Enter city : ");
        contact.city = sc.next();

        System.out.println("Enter state : ");
        contact.state = sc.next();

        System.out.println("Enter zip code : ");
        contact.zip = sc.nextInt();

        System.out.println("Enter phone number : ");
        contact.phoneNumber = sc.nextLong();

        System.out.println("Enter email : ");
        contact.email = sc.next();

        contactList.add(contact);

    }

    public void display(ArrayList<Contacts> contactList) {
        for (Contacts contact : contactList) {
            System.out.println(contact);
        }
    }

    public void editContact(ArrayList<Contacts> contactList) {

        System.out.println("Enter the first name of contact you wish to edit");
        String edit = sc.next();
        System.out.println("Press 1 - To edit first name");
        System.out.println("Press 2 - To edit last name");
        System.out.println("Press 3 - To edit address");
        System.out.println("Press 4 - To edit city");
        System.out.println("Press 5 - To edit state");
        System.out.println("Press 6 - To edit zip code");
        System.out.println("Press 7 - To edit phone number");
        System.out.println("Press 8 - To edit email");
        int choice = sc.nextInt();
        if (choice == 1) {
            for (Contacts contact : contactList) {
                if (contact.firstName.equals(edit)) {
                    System.out.println("Enter new first name");
                    contact.firstName = sc.next();
                }
            }
        }
        if (choice == 2) {
            for (Contacts contact : contactList) {
                if (contact.firstName.equals(edit)) {
                    System.out.println("Enter new last name");
                    contact.lastName = sc.nextLine();
                }
            }
        }
        if (choice == 3) {
            for (Contacts contact : contactList) {
                if (contact.firstName.equals(edit)) {
                    System.out.println("Enter new address");
                    contact.address = sc.nextLine();
                }
            }
        }
        if (choice == 4) {
            for (Contacts contact : contactList) {
                if (contact.firstName.equals(edit)) {
                    System.out.println("Enter new city");
                    contact.city = sc.next();
                }
            }
        }
        if (choice == 5) {
            for (Contacts contact : contactList) {
                if (contact.firstName.equals(edit)) {
                    System.out.println("Enter new state");
                    contact.state = sc.next();
                }
            }
        }
        if (choice == 6) {
            for (Contacts contact : contactList) {
                if (contact.firstName.equals(edit)) {
                    System.out.println("Enter new zip code");
                    contact.zip = sc.nextInt();
                }
            }
        }
        if (choice == 7) {
            for (Contacts contact : contactList) {
                if (contact.firstName.equals(edit)) {
                    System.out.println("Enter new phone number");
                    contact.phoneNumber = sc.nextLong();
                }
            }
        }
        if (choice == 8) {
            for (Contacts contact : contactList) {
                if (contact.firstName.equals(edit)) {
                    System.out.println("Enter new email");
                    contact.email = sc.next();
                }
            }
        }
    }

    public void deleteContact(ArrayList<Contacts> contactList) {
        System.out.println("Enter the first name of the contact you wish to delete");
        String delete = sc.next();
        contactList.removeIf(contact -> contact.firstName.equals(delete));
    }
}


