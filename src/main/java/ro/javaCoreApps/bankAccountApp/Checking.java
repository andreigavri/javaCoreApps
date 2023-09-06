package ro.javaCoreApps.bankAccountApp;

public class Checking extends Account {
    int debitCardNumber;
    int debitCardPin;


    Checking(String name, String socialSecurityNumber, double initialDeposit) {
        super(name, socialSecurityNumber, initialDeposit);
    }
}
