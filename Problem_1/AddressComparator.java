
/**
 * This is the class that will handle the Object Comparison
 *
 * @author Rizky Ramadian Wijaya
 * @version 6 April 2018
 */

import java.util.regex.*;

public class AddressComparator
{
    private String address1;
    private String address2;
    /**
     * Constructor for objects of class AddressComparator
     */
    public AddressComparator(String addr1, String addr2)
    {
        address1 = addr1;
        address2 = addr2;
    }
    
    public int compareStreet(){
        if(address1.contains("Jln") || address1.contains("Jalan") || address1.contains("Jl")){
            if(address2.contains("Jalan") || address2.contains("Jl") || address2.contains("Jln")){
                return 1;
            }
        }
        return 0;
    }
    
    public int compareCountry(){
        if(address1.contains("IDN") || address1.contains("Indonesia")){
            if(address2.contains("IDN") || address2.contains("Indonesia")){
                return 1;
            }
        }
        return 0;
    }
    
    public int compareRT(){
        if(address1.contains("RT") || address1.contains("Rt")){
            if(address2.contains("RT") || address2.contains("Rt")){
                return 1;
            }
        }
        return 0;
    }
    
    public int compareRW(){
        if(address1.contains("RW") || address1.contains("Rw")){
            if(address2.contains("RW") || address2.contains("Rw")){
                return 1;
            }
        }
        return 0;
    }
    
    public int compareNumber(){
        Pattern pat = Pattern.compile("Nomor [0-9]");
        Matcher match = pat.matcher(address1);
        Matcher match2 = pat.matcher(address2);
        if(match.find() == match2.find()) return 1;
        return 0;
    }
    
    public int fullTest(){
        int total = 0;
        total += compareStreet();
        total += compareCountry();
        total += compareRT();
        total += compareRW();
        total += compareNumber();
        return total;
    }
}
