/**
 *
 * @author Rayyan Faisal
 */
package coe318.lab4;

public class Account {
    
    private String name;
    private int number;
    private double balance;
    
    
    public Account(String name, int number, double initialBalance){
        this.name = name;
        this.number = number;
        this.balance = initialBalance;
    }
    
    public String getName(){
        return name;
    }
    
        public int getNumber(){
        return number;
    }
    
    public double getBalance(){
        return balance;
    }
    
    boolean deposit(double amount){
        if (amount > 0){
            this.balance += amount;
            return true;
        } else {
            return false;
        }
    }
    
    boolean withdraw(double amount){
        if ((this.balance - amount) >= 0 && amount > 0){
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " +
            String.format("$%.2f", getBalance()) + ")";
    }
   
}
