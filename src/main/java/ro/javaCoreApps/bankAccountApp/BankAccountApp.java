package ro.javaCoreApps.bankAccountApp;
import ro.javaCoreApps.utilities.CSV;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<>();

        // read the accounts from CSV file
        String accountsFile = "/Users/vladdstian/Desktop/javaCoreApps/src/main/java/ro/javaCoreApps/bankAccountApp/NewBankAccounts.csv";
        List<String[]> clientsList = CSV.read(accountsFile);
        for(String[] accountHolder: clientsList) {
            System.out.println("NEW ACCOUNT: ");
            String name = accountHolder[0];
            String socialSecurityNumber = accountHolder[1];
            String accountType = accountHolder[2];
            double initialAmount = Double.parseDouble(accountHolder[3]);
            if(accountType.equalsIgnoreCase("savings")) {
                accounts.add(new Saving(name, socialSecurityNumber, initialAmount));
            } else if (accountType.equalsIgnoreCase("checking")) {
                accounts.add(new Checking(name, socialSecurityNumber, initialAmount));
            } else {
                System.err.println("ERROR READING ACCOUNT TYPE!");
            }
        }

        for(Account acc: accounts) {
            acc.showInfo();
            System.out.println("----------------");
        }
    }
}
