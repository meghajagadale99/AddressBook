package com.addressbook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Contacts contact = new Contacts("Megha", "Jagadale", "Chembur", "Mumbai", "Maharashtra", 1234567890, "400071", "meghajagadale@gmail.com");
        System.out.println("Firstname:" + contact.getFirstName());
        System.out.println("Lastname:" + contact.getLastName());
        System.out.println("Address:" + contact.getAddress());
        System.out.println("City:" + contact.getCity());
        System.out.println("State:" + contact.getState());
        System.out.println("Phone number:" + contact.getPhoneNumber());
        System.out.println("Zip:" + contact.getZip());
        System.out.println("Email:" + contact.getEmail());
        System.out.println(contact);

    }
}
