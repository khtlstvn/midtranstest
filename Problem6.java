import java.util.*;
/**
 * Write a description of class Problem6 here.
 * this is a program for problem 6
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Problem6
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        String string1 = new String("abcde");
        String string2 = new String("bczah");
        
        String stringcon = string1+string2;
        System.out.println("string1 = " + string1);
        System.out.println("string2 = " + string2);
        
        System.out.println("gabungan = " + stringcon);

        char[] chars = stringcon.toCharArray();
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }
        
        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        System.out.println("output = " + sb.toString());
        
    }
}
