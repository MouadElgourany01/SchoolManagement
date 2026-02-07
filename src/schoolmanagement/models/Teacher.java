package models;

import enums.Gender;

import java.util.Arrays;
import java.util.Date;

public class Teacher extends Person {
    private Subject[] subjects;
    private final int id;
    private static int TEACHER_COUNTER;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private Gender gender;
    private String cin;
    private Date hiredate;
    public Teacher() {this.id = TEACHER_COUNTER++;}

    public int getId() {
        return id;
    }
    public String getFirstname() {return firstname;}
    public void setFirstname(String firstname) {this.firstname = firstname;}

    public String getLastname() {return lastname;}
    public void setLastname(String lastname) {this.lastname = lastname;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone;}

    public Gender getGender() {return gender;}
    public void setGender(Gender gender) {this.gender = gender;}

    public String getCin() {return cin;}
    public void setCin(String cin) {this.cin = cin;}

    public Date getHiredate() {return hiredate;}
    public void setHiredate(Date hiredate) {this.hiredate = hiredate;}

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id:" + id +
                ", firstName:" + this.firstname + '\'' +
                ", lastName:" + this.lastname + '\'' +
                ", email:" + this.email + '\'' +
                ", phone:" + this.phone + '\'' +
                ", gender:" + gender +
                ", cin:" + this.cin +
                ", hired date:" + this.hiredate +
                ", subjects:" + Arrays.toString(subjects) +
                '}';
    }
}
