package com.bridgelabz;
import java.util.ArrayList;
import java.util.List;
public class AddressBookService implements IAddressBookService {
    List<Person> personList = new ArrayList<>();

    /*Method Search the Person By City
     * @Param Person List
     */
    public static void searchByCity(List<Person> person) {
        String search;
        List<Person> matches = new ArrayList<>();
        System.out.println("Enter First Name to search : ");
        search = InputUtil.getStringValue();
        int flag = 0;
        for (Person p : person) {
            if (p.getCity().equalsIgnoreCase(search)) {
                flag = 1;
                matches.add(p);
            }
        }
        if (flag == 1) {
            System.out.println("...Match Found...");
            for (Person p : matches) {
                System.out.println(p);
            }
        } else {
            System.out.println("Match Not Found!!!");
        }
    }

    /*Method Search the Person By State
     * @Param Person List
     */
    public static void searchByState(List<Person> person) {
        String search;
        int flag = 0;
        List<Person> matches = new ArrayList<>();
        System.out.println("Enter First Name to search : ");
        search = InputUtil.getStringValue();
        for (Person p : person) {
            if (p.getState().equalsIgnoreCase(search)) {
                flag = 1;
                matches.add(p);
            }
        }
        if (flag == 1) {
            System.out.println("...Match Found...");
            for (Person p : matches) {
                System.out.println(p);
            }
        } else {
            System.out.println("Match Not Found!!!");
        }
    }
    /*Method Add Person Record*/
    public void addRecord() {
        int i = 0;
        String firstName = null;
        final String lastName, address, city, state, phone, zip;
        while (i == 0) {
            System.out.print("Enter First Name : ");
            firstName = InputUtil.getStringValue();
            if (checkExists(firstName)) {
                System.out.println("Person Name Already Exists!!\nPlease enter different name...");
            } else {
                i = 1;
            }
        }
        System.out.print("Enter Last Name : ");
        lastName = InputUtil.getStringValue();
        System.out.print("Enter Phone Number : ");
        phone = InputUtil.getStringValue();
        System.out.print("Enter Address : ");
        address = InputUtil.getStringValue();
        System.out.print("Enter city : ");
        city = InputUtil.getStringValue();
        System.out.print("Enter zip : ");
        zip = InputUtil.getStringValue();
        System.out.print("Enter state : ");
        state = InputUtil.getStringValue();

        personList.add(new Person(firstName, lastName, address, city, state, phone, zip));
    }

    /*Method to Display Person Records*/
    public void displayRecord() {
        if (personList.isEmpty()) {
            System.out.println("No Records To Display!!!");
        } else {
            personList.forEach(System.out::println);
        }

    }

    /*Method to Edit Person Record*/
    public void editRecord() throws AddressBookException {
        int id, i = 0;
        String address, city, state, phone, zip;
        try {
            if (personList.isEmpty()) {
                System.out.println("No Records To Edit!!!");
            } else {
                for (Person person : personList) {
                    System.out.println("ID: #" + personList.indexOf(person) + " : " + person);
                }
                System.out.print("\nEnter #ID to Edit Contact : ");
                id = InputUtil.getIntValue();
                System.out.println(personList.get(id));
                while (i == 0) {
                    System.out.println("What You Want to edit...\n"
                            + "\t1: Address\n"
                            + "\t2: city\n"
                            + "\t3: State\n"
                            + "\t4: Phone\n"
                            + "\t5: Zip Code\n"
                            + "\t6. Save And Exit\n");
                    int choice = InputUtil.getIntValue();
                    switch (choice) {
                        case 1:
                            System.out.print("Enter new Address : ");
                            address = InputUtil.getStringValue();
                            personList.get(id).setAddress(address);
                            break;
                        case 2:
                            System.out.print("Enter new City : ");
                            city = InputUtil.getStringValue();
                            personList.get(id).setCity(city);
                            break;
                        case 3:
                            System.out.print("Enter new State : ");
                            state = InputUtil.getStringValue();
                            personList.get(id).setState(state);
                            break;
                        case 4:
                            System.out.print("Enter new Phone : ");
                            phone = InputUtil.getStringValue();
                            personList.get(id).setPhone(phone);
                            break;
                        case 5:
                            System.out.print("Enter new Zip Code : ");
                            zip = InputUtil.getStringValue();
                            personList.get(id).setZip(zip);
                            break;
                        case 6:
                            i = 1;
                            break;
                        default:
                            System.out.println("Please Enter Valid Option");
                    }
                    System.out.println(personList.get(id));
                }
            }
        } catch (IndexOutOfBoundsException e) {
            throw new AddressBookException("Entered Wrong #ID", AddressBookException.exceptionType.ENTERED_WRONG_ID);
        }
    }

    /*Method to Delete Person Record*/
    public void deleteRecord() throws AddressBookException {
        try {
            int id;
            if (personList.isEmpty()) {
                System.out.println("No Records To Delete!!!");
            } else {
                personList.stream().map(p -> "ID: #" + personList.indexOf(p) + " : " + p).forEach(System.out::println);
                System.out.print("\nEnter #ID to delete Contact : ");
                id = InputUtil.getIntValue();
                personList.remove(id);
            }
        } catch (IndexOutOfBoundsException e) {
            throw new AddressBookException("Entered Wrong #ID", AddressBookException.exceptionType.ENTERED_WRONG_ID);
        }
    }

    /*Method to Check Duplication of First Name
     * @Param FirstName
     */
    public boolean checkExists(String firstName) {
        int flag = personList.stream().anyMatch(p -> p.getFirstName().equalsIgnoreCase(firstName)) ? 1 : 0;
        return flag == 1;
    }

    /*Method for Search Menu*/
    public void searchInRecords() {
        int i = 0;
        while (i == 0) {
            System.out.println("1. Search By City\n" +
                    "2. Search By State\n" +
                    "3. Back\n" +
                    "Choose Your Option");
            int choice = InputUtil.getIntValue();
            switch (choice) {
                case 1:
                    searchByCity(personList);
                    break;
                case 2:
                    searchByState(personList);
                    break;
                case 3:
                    i = 1;
                    break;
                default:
                    System.out.println("Please Enter Correct Option...");
            }
        }
    }
}