package ro.javaCoreApps;

import ro.javaCoreApps.emailApp.Email;

public class Main {
    public static void main(String[] args) {
        Email firstUser = new Email("Vlad", "Nichifor");
        firstUser.setDepartment();
        firstUser.setMailboxCapacity(500);
        firstUser.setPassword("abcdefg123456");
        System.out.println("PASSWORD IS: "+firstUser.getPassword());
        System.out.println(firstUser);
    }
}