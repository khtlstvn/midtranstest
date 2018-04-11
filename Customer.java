import java.util.*;
/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Customer
{
    // instance variables - replace the example below with your own
    ArrayList<Integer> transactions=new ArrayList<Integer>();
    ArrayList<String> emails=new ArrayList<String>();
    ArrayList<String> phones=new ArrayList<String>();
    ArrayList<String> cards=new ArrayList<String>();

    /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
        
    }
    
    public void addTransactions(int x){
        this.transactions.add(x);
    }
    
    public void addEmails(String mail1){
        this.emails.add(mail1);
    }
    
    public void addPhones(String phone){
        this.phones.add(phone);
    }
    
    public void addCards(String card){
        this.cards.add(card);
    }
    
    public String toString(){
        return "trans = " + transactions.toString() + ", emails = " + emails.toString() + ", phones = " + phones.toString() + ", cards = " + cards.toString();
    }
    

}
