package com.bridgelabz;
import java.util.List;
import java.util.LinkedList;

public interface IAddressBookService {

    List<Person> addRecord(List<Person> personList);

    List<Person> editRecord(List<Person> person) throws AddressBookException;

    void displayRecord(List<Person> person);

    List<Person> deleteRecord(List<Person> personList) throws AddressBookException;

    void sortRecords(List<Person> personList);

    void searchInRecords(List<Person> person);

    boolean checkExists(String firstName, List<Person> person);
}