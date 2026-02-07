package models;

import enums.Gender;

import java.util.Arrays;
import java.util.Date;

public class Student extends Person {
    private final int id;
    private String firstname;
    private String lastname;
    private Gender gender;
    private Date birthdate;
    private Date enrollmentDate;
    private String studentCode;
    private String parentName;
    private static int COUNTER;

    public Student() {
        super();
        this.id = ++COUNTER;
    }
    public int getId() {
        return id;
    }

    public String getFirstname() {return firstname;}
    public void setFirstname(String firstname) {this.firstname = firstname;}

    public String getLastname() {return lastname;}
    public void setLastname(String lastname) {this.lastname = lastname;}

    public Gender getGender() {return gender;}
    public void setGender(Gender gender) {this.gender = gender;}

    public Date getBirthdate() {return birthdate;}
    public void setBirthdate(Date birthdate) {this.birthdate = birthdate;}

    public Date getEnrollmentDate(){
        return enrollmentDate;
    }
    public void setEnrollmentDate(Date enrollmentDate){
        this.enrollmentDate = enrollmentDate;
    }

    public String getStudentCode(){
        return studentCode;
    }
    public void setStudentCode(String studentCode){
        this.studentCode = studentCode;
    }

    public String getParentName(){return parentName;}
    public void setParentName(String parentName){this.parentName = parentName;}

    @Override
    public String toString() {
        return "Student{" +
                "id:" + id +
                ", firstName:" + this.firstname + '\'' +
                ", lastName:" + this.lastname + '\'' +
                ", gender:" + gender +
                ", birthdate:" + birthdate +
                ", enrollmentDate:" + enrollmentDate +
                ", studentCode:" + studentCode +
                ", parentName:" + parentName +
                '}';
    }
}
