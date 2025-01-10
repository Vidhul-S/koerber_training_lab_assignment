package day2LabAssignment.bank;

public class Account {

    String name;
    int accountNumber;
    double accountBalance;
    public Account(){}
    public Account(String name,int accountNumber,double accountBalance){

        this.name = name;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }
    public void deposit(double amount){
        this.accountBalance += amount;
    }
}
