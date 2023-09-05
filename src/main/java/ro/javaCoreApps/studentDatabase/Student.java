package ro.javaCoreApps.studentDatabase;

import java.util.List;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private List<String> courses;
    private int tuitionBalance;
    private int costOfCourse = 600;

    // constructor to ask for name of Student and year
    public Student() {
        // prompt user for the name of the student
        String[] fullName = setStudentName().split(" ");
        this.firstName = titleName(fullName[0]);
        this.lastName = titleName(fullName[fullName.length-1]);
        if(fullName.length > 2) this.middleName = titleName(fullName[1]);

        //ask for grade year
        this.gradeYear = setYear();
        System.out.println(this);
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

    // enroll in courses

    // view balance

    // pay tuition

    // show status


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                (middleName==null ? "": ", middleName='" + middleName + '\'') +
                ", lastName='" + lastName + '\'' +
                ", gradeYear='" + gradeYear + '\'' +
                '}';
    }
}
