package ro.emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private Department department;
    private int mailboxCapacity;
    private String alternateEmail;

    //Constructor to receive first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();

        System.out.printf("EMAIL CREATED FOR: %s,%s. %nAdded to %s department database.%n",
                this.firstName,
                this.lastName,
                this.department);
    }

    //ask for department
    private Department setDepartment() {
        System.out.println("Please input your department("+ Department.allDepartments()+"): ");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        return Department.returnDepartmentFromString(answer);
    }

    //generate a random password

    // set the mailbox capacity

    //set the alternate email

    // change the password

    @Override
    public String toString() {
        return "Email{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", department='" + department + '\'' +
                ", mailboxCapacity=" + mailboxCapacity +
                ", alternateEmail='" + alternateEmail + '\'' +
                '}';
    }
}
