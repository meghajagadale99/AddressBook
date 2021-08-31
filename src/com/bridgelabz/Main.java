package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book program.");
        AddressBook storeValue = new AddressBook("Megha", "Jagadale", "Mumbai", "Maharashtra", "abc99@gmail.in", 400071, 100);
        storeValue.Display();
        storeValue.add();
    }
}
