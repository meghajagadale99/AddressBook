package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    ArrayList<Contacts> arrayArrayList = new ArrayList<Contacts>();
    static Scanner sc = new Scanner(System.in);

    public void addDetails() {
        Contacts details = new Contacts();
        System.out.println("Enter the first name");
        details.setFirstName(sc.nextLine());
        System.out.println("Enter the last name");
        details.setLastName(sc.nextLine());
        System.out.println("Enter the address");
        details.setAddress(sc.nextLine());
        System.out.println("Enter the city");
        details.setCity(sc.nextLine());
        System.out.println("Enter the state");
        details.setState(sc.nextLine());
        System.out.println("Enter the email");
        details.setEmail(sc.nextLine());
        System.out.println("Enter the zip code");
        details.setZip(sc.nextInt());
        System.out.println("Enter the phone number");
        details.setPhoneNumber(sc.nextLong());
        arrayArrayList.add(details);
        System.out.println(arrayArrayList);
    }

    public void display() {
        System.out.println(arrayArrayList);
    }

    public void editDetails() {
        System.out.println("Confirm your first name to edit details: ");
        String confirmName = sc.next();

        for (int i = 0; i < arrayArrayList.size(); i++) {
            if (arrayArrayList.get(i).getFirstName().equals(confirmName)) {
                System.out.println("Select form below to change: ");
                System.out.println("\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Zip\n7.Mobile number\n8.Email");
                int edit = sc.nextInt();

                switch (edit) {
                    case 1:
                        System.out.println("Enter first name");
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

    public void arrayArrayList() {
        System.out.println("Confirm the first name of the person to delete contact");
        String confirmName = sc.next();
        for (int i = 0; i < arrayArrayList.size(); i++) {

            if (arrayArrayList.get(i).getFirstName().equals(confirmName)) {
                arrayArrayList.remove(i);
                System.out.println("List After removing" + arrayArrayList);

            } else {
                System.out.println("Enter valid first name");
            }
        }
    }


    public static void main(String[] args) {
        AddressBookMain details = new AddressBookMain();
        int input;
        int ans;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.Add a contact");
            System.out.println("2.Edit a contact");
            System.out.println("3.Delete a contact");
            System.out.println("4.Display a contact");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    details.addDetails();
                    break;
                case 2:
                    details.editDetails();
                    break;
                case 3:
                    details.arrayArrayList();
                    break;
                case 4:
                    details.display();
                default:
                    System.out.println("Wrong option");
                    break;
            }
            System.out.println("Do you want to continue?(0/1)");
            ans = scanner.nextInt();
        } while (ans == 1);

    }
}
