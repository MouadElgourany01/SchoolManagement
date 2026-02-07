package schoolmanagement.models;

import schoolmanagement.enums.Gender;

import java.util.Arrays;
import java.util.Date;

public class Teacher extends Person {
    private Subject[] subjects;
    private final int id;
    private static int TEACHER_COUNTER;
    private Date hireDate;

    public Teacher() {this.id = TEACHER_COUNTER++;}

    public int getId() {
        return id;
    }

    public Date getHiredate() {return hireDate;}
    public void setHiredate(Date hireDate) {this.hireDate = hireDate;}

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
                ", hired date:" + this.hireDate +
                ", subjects:" + Arrays.toString(subjects) +
                '}'.format(super(toString()));
    }
}
