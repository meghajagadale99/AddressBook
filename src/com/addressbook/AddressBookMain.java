package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
     static ArrayList<Contacts> arrayArrayList = new ArrayList<Contacts>();
     static Scanner sc = new Scanner(System.in);

    public void addDetails(){
        Contacts datails = new Contacts();

        System.out.println("Enter the First Name");
        datails.setFirstName(sc.nextLine());

        System.out.println("Enter the Last Name");
        datails.setLastName(sc.nextLine());

        System.out.println("Enter the Address");
        datails.setAddress(sc.nextLine());

        System.out.println("Enter the City");
        datails.setCity(sc.nextLine());

        System.out.println("Enter the State");
        datails.setState(sc.nextLine());

        System.out.println("Enter the Email");
        datails.setEmail(sc.nextLine());

        System.out.println("Enter the Phone Number");
        datails.setPhoneNumber(sc.nextLong());

        System.out.println("Enter the Zip");
        datails.setZip(sc.nextLong());




        arrayArrayList.add(datails);
        sc.close();

    }
    public void display(){
        System.out.println(arrayArrayList);

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBookMain details = new AddressBookMain();
        details.addDetails();
        details.display();


    }
}
