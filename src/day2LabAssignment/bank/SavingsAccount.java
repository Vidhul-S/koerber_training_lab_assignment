package day2LabAssignment.bank;

public class SavingsAccount extends Account{

    static final int interst = 5;
    double maxWithdrawal;
    public SavingsAccount(String name,int accountNumber,double accountBalance){

        new Account(name,accountNumber,accountBalance);
        this.maxWithdrawal = accountBalance;
    }
    public double getBalance(){
        return this.accountBalance;
    }
    public void withdraw(double amount){
        if(amount <= this.maxWithdrawal){
            
        }
    }
}
