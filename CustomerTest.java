

/**
 * Write a description of class Test here.
 * this is the main program for problem 2
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CustomerTest
{
    // instance variables - replace the example below with your own

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main(String[] args)
    {
        Customer cus1 = new Customer();
        cus1.addTransactions(1);
        cus1.addTransactions(3);
        cus1.addEmails("e1");
        cus1.addPhones("p1");
        cus1.addPhones("p3");
        cus1.addCards("c3");
        cus1.addCards("c3");
        
        Customer cus2 = new Customer();
        cus2.addTransactions(2);
        cus2.addEmails("e2");
        cus2.addPhones("p2");
        cus2.addCards("c2");
        
        Customer cus3 = new Customer();
        cus3.addTransactions(4);
        cus3.addEmails("e4");
        cus3.addPhones("p4");
        cus3.addCards("c4");       
        
        Customer cus4 = new Customer();
        cus4.addTransactions(5);
        cus4.addEmails("e2");
        cus4.addPhones("p4");
        cus4.addCards("c5");
        
        System.out.println("customer 1 =" + cus1.toString());
        System.out.println("customer 2 =" + cus2.toString());
        System.out.println("customer 3 =" + cus3.toString());
        System.out.println("customer 4 =" + cus3.toString());
        
        
    }
}
