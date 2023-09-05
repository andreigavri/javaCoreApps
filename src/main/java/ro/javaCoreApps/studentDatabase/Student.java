package ro.javaCoreApps.studentDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private static int id = 10001;
    private static int costOfCourse = 600;
    private String firstName;
    private String middleName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private List<String> courses;
    private int tuitionBalance = 0;

    // constructor to ask for name of Student and year
    public Student() {
        // increment universal id
        Student.id ++;
        // prompt user for the name of the student
        String[] fullName = setStudentName().split(" ");
        this.firstName = titleName(fullName[0]);
        this.lastName = titleName(fullName[fullName.length-1]);
        if(fullName.length > 2) this.middleName = titleName(fullName[1]);

        //ask for grade year
        this.gradeYear = setYear();

        // set student id value
        this.studentID = setStudentId();

        this.courses = new ArrayList<>();
    }

    public String setStudentName() {
        Scanner studScan = new Scanner(System.in);
        System.out.println("Please input your complete name separated by spaces (Ex: John Doe, John Will Smith): ");
        return studScan.nextLine();
    }

    private static String titleName(String s) {
        return s.toUpperCase().charAt(0) + s.toLowerCase().substring(1);
    }

    private String setYear() {
        Scanner yearScan = new Scanner(System.in);
        System.out.println("Enter student class level:\n1-Freshman;\n2-Sophomore;\n3-Junior;\n4-Senior.");
        System.out.print("Choice: ");
        switch (yearScan.nextInt()) {
            case (1) -> {
                return "Freshman";
            }
            case (2) -> {
                return "Sophomore";
            }
            case (3) -> {
                return "Junior";
            }
            case (4) -> {
                return "Senior";
            }
            default -> {
                return setYear();
            }
        }
    }

    // generate unique id
    private String setStudentId() {
        return "" + this.firstName.toLowerCase().charAt(0) + id + this.lastName.toLowerCase().charAt(0);
    }

    // enroll in courses
    public void enroll(String courseName) {
        this.courses.add(courseName);
        this.tuitionBalance += costOfCourse;
        System.out.println("Student " + this.firstName + " " + this.lastName + "(id: " + this.studentID +
                ") has been enrolled in the following course: " + titleName(courseName) + '\n');
    }

    // view balance
    public int getTuitionBalance() {
        System.out.println("Tuition balance for student: " + this.firstName + " " + this.lastName +
                "(id: " + this.studentID + ") is $" + this.tuitionBalance);
        return tuitionBalance;
    }

    // pay tuition
    public void payTuition(int payment) {
        System.out.println("$" + payment + " has been payed for student " + this.firstName + " " + this.lastName +
                "(id: " + this.studentID + ")");
        tuitionBalance -= payment;
        //print status
        this.getTuitionBalance();
    }

    // show status
    @Override
    public String toString() {
        return "Name: " + firstName + (middleName==null ? ' ': ' ' + middleName + ' ') + lastName + '\n' +
                "Year: " + gradeYear + '\n' +
                "Student ID: " + studentID + '\n' +
                "Courses Enrolled: " + courses.toString() + '\n' +
                "Tuition Balance: $" + tuitionBalance + '\n' ;
    }
}
