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
        
    }
}