package ro.emailApp;

import java.util.Scanner;

public class Email{
    private String firstName;
    private String lastName;
    private String password;
    private Department department;
    private int mailboxCapacity;
    private String alternateEmail;
    private String assignedEmail;

    //Constructor to receive first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = randomPassword(8);

        System.out.printf("EMAIL CREATED FOR: %s,%s. %nAdded to %s department database.%nPASSWORD: %s%n",
                this.firstName,
                this.lastName,
                this.department,
                this.password);
    }

    //ask for department
    public Department setDepartment() {
        System.out.println("Please input your department(" + Department.allDepartments() + "): ");

        // read user input
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();

        //search for department string in the Department Enum
        //if user already has assigned a Department, use the method to change it
        Department newDepartment = Department.returnDepartmentFromString(answer);
        if (this.department != null)
            System.out.printf("Changing department for %s %s from %s to %s.%n",
                    this.firstName,
                    this.lastName,
                    this.department,
                    newDepartment);
        return newDepartment;
    }

    //generate a random password
    private String randomPassword(int length) {
        String passwordCharSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@!#$%&*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int charIndex = (int)(Math.random() * passwordCharSet.length());
            password[i] = passwordCharSet.charAt(charIndex);
            //TODO: add conditions to also have random small letters in the password
            // and at least a special char
        }
        return new String(password);
    }
    // set the mailbox capacity

    //set the alternate email

    // change the password
}
