package ro.emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private Department department;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String assignedEmail;
    private String alternateEmail;
    private String companyName = "abcdefg";
    private String domain = "com";

    //Constructor to receive first name and last name and request user input for department
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = randomPassword(defaultPasswordLength);
        this.assignedEmail = generateEmail();

        System.out.println("----------------------");
        System.out.printf("NEW EMAIL CREATED FOR: %nUSER: %s, %s%nDEPARTMENT: %s%n",
                this.firstName,
                this.lastName,
                this.department);
        System.out.println("----------------------");
        System.out.println("EMAIL ADDRESS: " + this.assignedEmail);
        System.out.println("PASSWORD: " + this.password);
        System.out.println("----------------------");
    }

    //ask for department
    public Department setDepartment() {
        System.out.println("Please input your department(" + Department.allDepartments() + "): ");
        // read user input
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();

        //search for department string in the Department Enum
        Department newDepartment = Department.returnDepartmentFromString(answer);

        // if user already has assigned a Department, use the method to change the department and
        // assign a new email to account
        if (department != null && department == newDepartment) { // check if the new department is the same and warn user
            System.out.println("----------------------");
            System.out.println("USER: " + this.firstName +" " + this.lastName + " IS ALREADY ASSIGNED TO THE " +
                    this.department + " DEPARTMENT");
            System.out.println("----------------------");
        } else if (department != null) {
            System.out.println("----------------------");
            System.out.printf("CHANGING DEPARTMENT FOR USER: %s %s, FROM %s TO %s.%n",
                    this.firstName,
                    this.lastName,
                    this.department,
                    newDepartment);
            this.department = newDepartment;
            this.assignedEmail = generateEmail();
            System.out.println("NEW EMAIL ADDRESS ASSIGNED: " + this.assignedEmail);
            System.out.println("----------------------");
        }
        return newDepartment;
    }

    //generate a random password
    private static String randomPassword(int length) {
        String passwordCharSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@!#$%&*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int charIndex = (int) (Math.random() * passwordCharSet.length());
            char randChar = passwordCharSet.charAt(charIndex);

            // randomize the chance of setting a char to lowercase
            int randCaseChoice = (int) Math.round(Math.random());
            if (Character.isAlphabetic(randChar) && randCaseChoice == 0) {
                randChar = Character.toLowerCase(randChar);
            }

            password[i] = randChar;
        }
        return new String(password);
    }

    // generate email address based on fields
    private String generateEmail() {
        return firstName.toLowerCase().charAt(0) + "." +
                lastName.toLowerCase() + "@" +
                //checking if the department is set to NONE and not setting the email address with it if so
                (department.name().equalsIgnoreCase("none") ? "" : department.name().toLowerCase() + ".") +
                companyName.toLowerCase() + "." + domain;
    }

    // set the mailbox capacity
    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    //set the alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    // change the password
    public void setPassword(String password) {
        this.password = password;
    }

    // Getters for password, mailbox capacity and email address
    public String getPassword() {
        return password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAssignedEmail() {
        return assignedEmail;
    }

    @Override
    public String toString() {
        return "DISPLAY NAME: " + firstName + ' ' + lastName+'\n' +
                "COMPANY NAME: " + companyName + '\n' +
                "EMAIL ADDRESS: " + assignedEmail + '\n' +
                "MAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}
