package schoolmanagement.models;

import java.util.Date;

import schoolmanagement.enums.Gender;

public class Person {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String phone;
    private String address;
    private Gender gender;
    private String cin;
    private final int id;
    private static int COUNTER;

    public Person() {
        this.id = ++COUNTER;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstName;}

    public void setFirstname(String firstName) {this.firstName = firstName;
    }

    public String getLastname() {
        return lastName;}

    public void setLastname(String lastName) {this.lastName = lastName;
    }

    public Date getBirthdate() {
        return birthDate;}

    public void setBirthdate(Date birthDate) {this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id:" + id +
                "First Name:" + firstName +
                "Last Name:" + lastName +
                "Birth Date:" + birthDate +
                "Phone:" + phone +
                "Address:" + address +
                "Gender:" + gender +
                "Cin:" + cin +
                '}';
    }

}
