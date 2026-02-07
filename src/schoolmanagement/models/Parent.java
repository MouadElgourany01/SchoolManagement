package schoolmanagement.models;
import schoolmanagement.enums.Gender;

import java.util.Arrays;

public class Parent extends Person {
    private final int id;
    private static int PARENT_COUNTER;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Gender gender;
    private String cin;
    private Student[] students;

    public Parent() {
        this.id = PARENT_COUNTER++;
    }
    public int getId() {return id;}

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone;}

    public Gender getGender() {return gender;}
    public void setGender(Gender gender) {this.gender = gender;}

    public String getCin() {return cin;}
    public void setCin(String cin) {this.cin = cin;}

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "id:" + id +
                ", firstName:" + this.firstName + '\'' +
                ", lastName:" + this.lastName + '\'' +
                ", email:" + this.email + '\'' +
                ", phone:" + this.phone + '\'' +
                ", gender:" + gender +
                ", cin:" + this.cin +
                '}';
    }

}
