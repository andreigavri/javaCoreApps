package ro.emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    //Constructor to receive first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();

        System.out.printf("Email for %s,%s has been created. Added to %s department database.%n",
                this.firstName,
                this.lastName,
                this.department);
    }

    //ask for department
    private String setDepartment() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your department: ");
        return scan.nextLine();
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
