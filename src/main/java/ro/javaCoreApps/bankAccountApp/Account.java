package ro.javaCoreApps.bankAccountApp;

public abstract class Account implements IBaseRate{
    String name;
    String socialSecurityNumber;
    double balance = 0;
    String accountNumber;
    double interestRate;

    Account(String name, String socialSecurityNumber, double initialDeposit) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.balance += initialDeposit;

        //test
        System.out.println(this.getClass().getSimpleName());
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
