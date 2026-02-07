package services;

import models.Parent;
import models.Student;
import models.Teacher;
import models.Subject;
import dao.MemoryDatabase;

public class SchoolService {
    private Subject[] subjects = MemoryDatabase.SUBJECTS_T; //RAM
    private Teacher[] teachers = MemoryDatabase.TEACHERS_T;
    private Parent[] parents = MemoryDatabase.PARENTS_T;
    private Student[] students = MemoryDatabase.STUDENTS_T;

}
