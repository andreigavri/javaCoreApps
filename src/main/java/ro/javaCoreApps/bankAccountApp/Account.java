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
        this.setRate();
        index++;
    }

    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoDigSSN = this.socialSecurityNumber.substring(socialSecurityNumber.length()-2);
        int uniqueID = index;
        int randomNum = (int)(Math.random()*Math.pow(10, 3));
        return lastTwoDigSSN + uniqueID + randomNum;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("$" + amount + " has been added to " + this.name);
        printBalance();
    }

    public void withdraw(double amount) {
        if(amount>balance) System.out.println("Not enough money in the account!");
        else balance = balance - amount;
        printBalance();
    }

    public void transfer(Account destAccount, double amount) {
        this.balance -= amount;
        destAccount.balance += amount;
        System.out.println("$" + amount + " transferred to " + destAccount.name);
        printBalance();
    }

    public void printBalance() {
        System.out.println("The balance for the account: " + this.name + " is $" + this.balance);
    }

    public void showInfo() {
        System.out.println(
                        "NAME: " + name +
                        "\nACCOUNT TYPE: " + this.getClass().getSimpleName().toUpperCase() +
                        "\nACCOUNT NUMBER: " + accountNumber +
                        "\nBALANCE: " + balance +
                        "\nINTEREST RATE: " + interestRate + '%'
                        );
    }
}
