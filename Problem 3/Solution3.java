
/**
 * Phone Number Normalizer
 *
 * @author Rizky Ramadian Wijaya
 * @version 6 April 2018
 */

import java.util.*;

public class Solution3
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String number = input.next();
        
        if(number.startsWith("+")||number.startsWith("?"))
        {
            number = number.replaceAll("[^0-9]+","");
            System.out.println(number);
        }
        
        if(number.startsWith("(")&&number.matches("//([0][0-9)]+"))
        {
            number = number.replaceAll("[(][0]","62");
            number = number.replaceAll("[^0-9]+","");
            System.out.println(number);
        }
       
        
    }
}
