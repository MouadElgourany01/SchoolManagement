package schoolmanagement.models;
import schoolmanagement.enums.Gender;

import java.util.Arrays;

public class Parent extends Person {
    private final int id;
    private static int PARENT_COUNTER;
    private Student[] students;

    public Parent() {
        this.id = PARENT_COUNTER++;
    }
    public int getId() {return id;}

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
                "Student:"+ Arrays.toString(students)+
                '}'.format(super(toString()));
    }

}
