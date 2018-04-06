
/**
 * Customer Class of the problem
 *
 * @author Rizky Ramadian Wijaya
 * @version 6 April 2018
 */
public class Customer
{
    private static String[] id;
    private static String[] email;
    private static String[] phone;
    private static String[] card;
    private static int count = 0;
    
    public Customer(String id,String email,String phone,String card){
        this.id[count] = id;
        this.email[count] = email;
        this.phone[count] = phone;
        this.card[count] = card;
        count++;
    }
    
    public static void setCustomer(String id,String email,String phone,String card){
        Customer.id[count] = id;
        Customer.email[count] = email;
        Customer.phone[count] = phone;
        Customer.card[count] = card;
        count++;
    }
    
    public static void printCustomer(){
        
        
    }
    
    public static void setCount(int count){
        Customer.count = count;
    }
}
