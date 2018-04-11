
/**
 * Write a description of class AddressSimilarities here.
 * this is a program for problem 1
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AddressSimilarities
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class AddressSimilarities
     */
    public AddressSimilarities()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main(String[] args)
    {
        // put your code here
        String string1 = new String("Jln budi mulia Gg. F2 Nomor 28 D RT. 04 Rw.02, JakSel. IDN");
        String string2 = new String("Jl BudiMulia Gang f2 Nomor 28 D RT. 02/02, Jakarta Selatan. IDN.");

        /*for(int x : string1){
            System.out.println("a");
        }*/
        
        System.out.println("Is address similar? = " + string1.equals(string2));
        
    }
}
