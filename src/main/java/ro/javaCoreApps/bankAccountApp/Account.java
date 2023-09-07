package ro.javaCoreApps.bankAccountApp;

public abstract class Account implements IBaseRate {
    private static int index = 10000;
    private String socialSecurityNumber;
    private double balance = 0;
    private String name;
    protected String accountNumber;
    protected double interestRate;

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
    }

    public void withdraw(double amount) {
        if(checkEnoughBalance(amount)) {
            System.out.println("$" + amount + " has been withdrawn from " + this.name);
        } else System.out.println("Not enough money in the account!");
    }

    public void transfer(Account destAccount, double amount) {
        if(checkEnoughBalance(amount)) {
            System.out.println("$" + amount + " transferred to " + destAccount.name);
            destAccount.deposit(amount);
        } else System.out.println("Not enough money in the account!");
        printBalance();
    }

    private boolean checkEnoughBalance(double amount) {
        return amount <= this.balance;
    }

    public void compound() {
        double accruedInterest = balance * (interestRate/100);
        balance += accruedInterest;
        System.out.println("Accrued interest: $" + accruedInterest);
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
