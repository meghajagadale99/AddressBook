package com.bridgelabz;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book program.");
        AddressBook storeValue = new AddressBook("Megha", "Jagadale", "Mumbai", "Maharashtra", "abc99@gmail.in", 400071, 100);
        storeValue.Display();
        storeValue.add();
        storeValue.edit();
        List values = storeValue.list;
        System.out.println("List after edit: " + values);
        storeValue.delete();
        List valuesAfterDelete = storeValue.list;
        System.out.println("List After Deletion: " + valuesAfterDelete);
    }
}
