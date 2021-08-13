package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    static ArrayList<Contacts> arrayArrayList = new ArrayList<Contacts>();
    static Scanner sc = new Scanner(System.in);

    public void addDetails() {
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
        System.out.println(arrayArrayList);

    }


    public void editDetails() {
        System.out.println("Confirm your first name to edit details: ");
        String confirmName = sc.next();

        for (int i = 0; i < arrayArrayList.size(); i++) {
            if (arrayArrayList.get(i).equals(confirmName)) {
                System.out.println("Select form below to change: ");
                System.out.println("\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Zip\n7.Mobile number\n8.Email");
                int edit = sc.nextInt();

                switch (edit) {
                    case 1:
                        System.out.println("Enter First name");
                        arrayArrayList.get(i).setFirstName(sc.next());
                        break;
                    case 2:
                        System.out.println("Enter Last name");
                        arrayArrayList.get(i).setLastName(sc.next());
                        break;
                    case 3:
                        System.out.println("Enter Address");
                        arrayArrayList.get(i).setAddress(sc.next());
                        break;
                    case 4:
                        System.out.println("Enter City");
                        arrayArrayList.get(i).setCity(sc.next());
                        break;
                    case 5:
                        System.out.println("Enter State");
                        arrayArrayList.get(i).setState(sc.next());
                        break;
                    case 6:
                        System.out.println("Enter Zip");
                        arrayArrayList.get(i).setZip(sc.nextInt());
                        break;
                    case 7:
                        System.out.println("Enter Mobile number");
                        arrayArrayList.get(i).setPhoneNumber(sc.nextLong());
                        break;
                    case 8:
                        System.out.println("Enter new E-mail");
                        arrayArrayList.get(i).setEmail(sc.next());
                        break;
                }
                System.out.println("Edited list is: ");
                System.out.println(arrayArrayList);
            } else
                System.out.println("Enter a valid First name");
        }

    }

    public void display() {
        System.out.println(arrayArrayList);

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        AddressBookMain details = new AddressBookMain();
        details.addDetails();
        details.display();
        int i = 0;
        while (i == 0) {
            System.out.println("Welcome to Address Book Program");
            System.out.println("What do you want to do: ");
            System.out.println("1.Add details.\n2.Edit details.");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    details.addDetails();
                    break;
                case 2:
                    details.editDetails();
                    break;
                default:
                    i = 1;
                    System.out.println("Wrong option");
                    break;
            }
        }


    }
}
