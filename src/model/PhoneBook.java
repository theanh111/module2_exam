package model;

import java.io.Serializable;

public class PhoneBook implements Serializable {
    private int numberPhone;
    private String typeOfPhoneBook;
    private String name;
    private String gender;
    private String address;
    private String dateOfBirth;
    private String email;

    public PhoneBook() {
    }

    public PhoneBook(int numberPhone, String typeOfPhoneBook, String name, String gender, String address, String dateOfBirth, String email) {
        this.numberPhone = numberPhone;
        this.typeOfPhoneBook = typeOfPhoneBook;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getTypeOfPhoneBook() {
        return typeOfPhoneBook;
    }

    public void setTypeOfPhoneBook(String typeOfPhoneBook) {
        this.typeOfPhoneBook = typeOfPhoneBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Phone Book [ " +
                "Number Phone = " + numberPhone +
                ", Type Of Phone Book = " + typeOfPhoneBook +
                ", Name = " + name +
                ", Gender = " + gender +
                ", Address = " + address +
                ", Date Of Birth = " + dateOfBirth +
                ", Email = " + email +
                " ]";
    }
}
