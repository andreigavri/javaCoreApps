package ro.javaCoreApps;

import ro.javaCoreApps.emailApp.Email;
import ro.javaCoreApps.studentDatabase.Student;
public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 2: Student Database");
        Student newStudent = new Student();
        System.out.println("-----------------");
        newStudent.getTuitionBalance();
        newStudent.enroll("Mathemathics 101");
        newStudent.enroll("History 101");
        newStudent.enroll("English 101");
        newStudent.enroll("Chemistry 101");
        newStudent.enroll("Computer Science 101");
        newStudent.getTuitionBalance();
        System.out.println("-----------------");
        newStudent.payTuition(400);
        System.out.println(newStudent);

        System.out.println("\n\nExercise 1: Email Creation App");
        Email firstUser = new Email("Vlad", "Nichifor");
        firstUser.setDepartment();
        firstUser.setMailboxCapacity(500);
        firstUser.setPassword("abcdefg123456");
        System.out.println("PASSWORD IS: "+firstUser.getPassword());
        System.out.println(firstUser);
    }
}