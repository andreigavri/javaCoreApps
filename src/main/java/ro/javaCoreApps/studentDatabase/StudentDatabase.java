package ro.javaCoreApps.studentDatabase;

import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {
    private List<Student> studentList;

    public StudentDatabase() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(Student student) {
        studentList.remove(student);
    }
}
