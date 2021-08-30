package com.bridgelabz;

public class Person {
    private final String firstName;
    private final String lastName;
    private String address;
    private String city;
    private String state;
    private String phone;
    private String zip;

    /*Constructor to initialize fields*/
    public Person(String firstName, String lastName, String address, String city, String state, String phone, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phone = phone;
        this.zip = zip;
    }

    /*Getter & Setter Methods*/
    public String getFirstName() {
        return firstName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Person{" +
                "First Name ='" + firstName + '\'' +
                ", Last Name ='" + lastName + '\'' +
                ", Address ='" + address + '\'' +
                ", City ='" + city + '\'' +
                ", State ='" + state + '\'' +
                ", Phone ='" + phone + '\'' +
                ", Zip ='" + zip + '\'' +
                '}';
    }
}

