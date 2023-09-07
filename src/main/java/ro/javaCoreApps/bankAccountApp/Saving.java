package ro.javaCoreApps.bankAccountApp;

public class Saving extends Account {
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    Saving(String name, String socialSecurityNumber, double initialDeposit) {
        super(name, socialSecurityNumber, initialDeposit);
        this.accountNumber = '1' + this.accountNumber;
        setSafetyDepositBox();
        this.showInfo();
    }

    @Override
    public void setRate() {
        this.interestRate = getBaseRate()-0.25;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(
                "\tSAVING ACCOUNT FEATURES: " +
                "\n\t- Safety deposit box ID: " + safetyDepositBoxID+
                "\n\t- Safety deposit box key: " + safetyDepositBoxKey
        );
    }
}
