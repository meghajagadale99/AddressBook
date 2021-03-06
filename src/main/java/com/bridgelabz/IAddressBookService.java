package com.bridgelabz;

public interface IAddressBookService {

    void addRecord();

    void editRecord() throws AddressBookException;

    void displayRecord();

    void deleteRecord() throws AddressBookException;

    void searchInRecords();

    boolean checkExists(String firstName);
}