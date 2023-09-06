package ro.javaCoreApps.bankAccountApp;

public class Saving extends Account {
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    Saving(String name, String socialSecurityNumber, double initialDeposit) {
        super(name, socialSecurityNumber, initialDeposit);
    }
}
