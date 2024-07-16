package com.Bhumit;

class Account{
    int acc_no;
    String Name;
    float Amount;
    void InsertInfo(int a, String n, float amt){
        acc_no = a;
        Name = n;
        Amount = amt;
    }
    void Deposit(float amt){
        Amount = Amount + amt;
        System.out.println(amt + " Deposited");
    }
    void Withdraw(float amt){
        Amount = Amount - amt;
        System.out.println(amt + " Withdrawn");
    }
    void CheckBalance(){
        System.out.println("Balance is: "+ Amount);
    }
    void DisplayInformation(){
        System.out.println(acc_no + " " + Name + " " + Amount);
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.InsertInfo(45127545, "Neha", 30000);
        a1.DisplayInformation();
        a1.CheckBalance();
        a1.Deposit(1000);
        a1.CheckBalance();
        a1.Withdraw(200);
        a1.CheckBalance();
    }
}
