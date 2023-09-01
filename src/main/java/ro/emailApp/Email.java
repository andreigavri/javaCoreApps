package ro.emailApp;

import java.util.Scanner;

public class Email{
    private String firstName;
    private String lastName;
    private String password;
    private Department department;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String assignedEmail;

    //Constructor to receive first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = randomPassword(defaultPasswordLength);

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
            char randChar = passwordCharSet.charAt(charIndex);

            // randomize the chance of setting a char to lowercase
            int randCaseChoice = (int)Math.round(Math.random());
            if(Character.isAlphabetic(randChar) && randCaseChoice == 0) {
                randChar = Character.toLowerCase(randChar);
            }

            password[i] = randChar;
        }
        return new String(password);
    }

    private String generateEmail() {
        return firstName.toLowerCase().charAt(0) + "." +
                lastName.toLowerCase() + "@" +
                //checking if the department is set to NONE and not setting the email address with it if so
                (department.name().equalsIgnoreCase("none") ? "" : department.name().toLowerCase() + ".") +
                companyName.toLowerCase() + "." + domain;
    }
    // set the mailbox capacity

    //set the alternate email

    // change the password
}
