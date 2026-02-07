package schoolmanagement.models;

import schoolmanagement.enums.Gender;

import java.util.Arrays;
import java.util.Date;

public class Student extends Person {
    private final int id;
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
                ", enrollmentDate:" + enrollmentDate +
                ", studentCode:" + studentCode +
                ", parentName:" + parentName +
                '}'.format(super(toString()));
    }
}
