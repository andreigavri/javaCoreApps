package ro.javaCoreApps.bankAccountApp;

public class Checking extends Account {
    int debitCardNumber;
    int debitCardPin;


    Checking(String name, String socialSecurityNumber, double initialDeposit) {
        super(name, socialSecurityNumber, initialDeposit);
        this.accountNumber = '2' + this.accountNumber;
        setDebitCard();
        this.showInfo();
    }

    private void setDebitCard() {
        debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
        debitCardPin = (int)(Math.random() * Math.pow(10, 4));
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(
                "\tCHECKING ACCOUNT FEATURES: " +
                "\n\t- Debit card number: " + debitCardNumber+
                "\n\t- Debit card PIN: " + debitCardPin + '\n'
        );
    }
}
