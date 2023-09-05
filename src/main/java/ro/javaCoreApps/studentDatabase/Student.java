package ro.javaCoreApps.studentDatabase;

import java.util.List;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private int year;
    private String studentID;
    private List<String> courses;
    private int tuitionBalance;
    private int costOfCourse = 600;

    // constructor to ask for name of Student and year
    public Student() {
        String[] fullName = setStudentName().split(" ");
        this.firstName = titleName(fullName[0]);
        this.lastName = titleName(fullName[fullName.length-1]);
        if(fullName.length > 2) this.middleName = titleName(fullName[1]);
        System.out.println(this);
    }

    public String setStudentName() {
        Scanner studscan = new Scanner(System.in);
        System.out.println("Please input your complete name separated by spaces (Ex: John Doe, John Will Smith): ");
        return studscan.nextLine();
    }

    private String titleName(String s) {
        return s.toUpperCase().charAt(0) + s.toLowerCase().substring(1);
    }

    // generate unique id

    // enroll in courses

    // view balance

    // pay tuition

    // show status

    @Override
    public String toString() {
        return "Student{ " +
                "firstName='" + firstName + '\'' +
                (middleName==null ? "": ", middleName='" + middleName + '\'') +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
