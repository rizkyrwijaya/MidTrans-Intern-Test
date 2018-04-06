/**
 * Two address comparator
 *
 * An address has multiple information, the most important information is that there
 * is a street name, city, country.
 * For this question, the factors that will be used to calculate the similarity
 * will be the presence of a street, city, and country.
 *
 *
 * @author Rizky Ramadian Wijaya
 * @version 6 April 2018
 */

import java.util.*;

public class Solution
{
    public static void main(String args[]){
        String address1 = "Jalan test no 232 RT 01 RW 01";
        String address2 = "Jalan test no 232 RT 01 RW 01 Indonesia";
        AddressComparator test = new AddressComparator(address1, address2);
        System.out.println("Kesamaan = "+ test.fullTest()*20 + "%");
    }
}
