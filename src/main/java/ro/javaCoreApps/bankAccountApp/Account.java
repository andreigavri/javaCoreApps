package ro.javaCoreApps.bankAccountApp;

public abstract class Account implements IBaseRate {
    static int index = 10000;
    String name;
    String socialSecurityNumber;
    double balance = 0;
    String accountNumber;
    double interestRate;

    Account(String name, String socialSecurityNumber, double initialDeposit) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.balance += initialDeposit;
        this.accountNumber = setAccountNumber();
        index++;
    }

    private String setAccountNumber() {
        String lastTwoDigSSN = this.socialSecurityNumber.substring(socialSecurityNumber.length()-2);
        int uniqueID = index;
        int randomNum = (int)(Math.random()*Math.pow(10, 3));
        return lastTwoDigSSN + uniqueID + randomNum;
    }

    public void showInfo() {
        System.out.println(
                        "NAME: " + name +
                        "\nACCOUNT TYPE: " + this.getClass().getSimpleName().toUpperCase() +
                        "\nACCOUNT NUMBER: " + accountNumber +
                        "\nBALANCE: " + balance
                        );
    }
}
