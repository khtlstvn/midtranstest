import java.util.regex.*;
import java.util.Scanner;
/**
 * Write a description of class PhoneNormalizer here.
 * this is a program for problem 3
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhoneNormalizer
{
    public String telefon;
        public String setTelefon(String telefon){
        Pattern pattern_telefon = Pattern.compile("^62[0-9]{9,}$");
        Pattern selainAngka = Pattern.compile("[^0-9]");
        Pattern angka0 = Pattern.compile("^0");
        Matcher matcher_telefon = pattern_telefon.matcher(telefon);
        if(matcher_telefon.matches()){
            this.telefon=telefon;
            return telefon;
        }
        else{
            String telefon1 = telefon.replaceAll("[^0-9]", "");
            String telefon2 = telefon1.replaceAll("^0", "62");
            
            return telefon2 + " <-normalized";
        }
    }
    
    public static void main(String[] args){
        PhoneNormalizer phone = new PhoneNormalizer();
        String stringinput = new String();
        
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter phone number: ");
        stringinput = reader.next(); // Scans the next token of the input as an int.
        //once finished
        reader.close();
        
        System.out.println(phone.setTelefon(stringinput));
    }
}


