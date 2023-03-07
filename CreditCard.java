import java.util.*;

public class CreditCard{
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public CreditCard(String cust, String bk, String acnt, int lim, double initialBal){
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }
    public CreditCard(String cust, String bk, String acnt, int lim){
        this(cust, bk, acnt, lim, 0.0);
    }

    //methods
    public String getCustomer(){return customer;}
    pubi String getBank(){return bank;}
    public String getAccount(){return account;}
    public int getLimit(){return limit;}
    public double getBalance(){return balance;}

    //methods updates
    public boolean charge(double price){
        if(price + balance > limit)
        return true;
    }
    public void makePayment(double amout){
        balance -= amount;
    }
    //method to print account information
    public static void printSummary(CreditCard card){
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.balance);
        System.out.println("Limit = " + card.limit);
    }
}