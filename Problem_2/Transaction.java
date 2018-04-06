/**
 * Transaction Class of the problem
 *
 * @author Rizky Ramadian Wijaya
 * @version 6 April 2018
 */

import java.util.*;

public class Transaction
{
    private static int[] id;
    private static String[] email;
    private static String[] phone;
    private static String[] card;
    private static int count = 0;
    
    static StringBuffer ids = new StringBuffer();
    static StringBuffer emails = new StringBuffer();
    static StringBuffer phones = new StringBuffer();
    static StringBuffer cards = new StringBuffer();
    
    public Transaction(int id,String email,String phone,String card){
        this.id[count] = id;
        this.email[count] = email;
        this.phone[count] = phone;
        this.card[count] = card;
        
        count++;
    }
    
    public static void addTransaction(int id,String email,String phone,String card){
        Transaction.id[count] = id;
        Transaction.email[count] = email;
        Transaction.phone[count] = phone;
        Transaction.card[count] = card;
        count++;
    }
    
    public static void checkCustomer(){
        Customer.setCount(0);
        for(int i=0;i<id.length;i++){
            ids = new StringBuffer();
            emails = new StringBuffer();
            phones = new StringBuffer();
            cards = new StringBuffer();
            ids.append(i);
            phones.append(phone[i]);
            emails.append(email[i]);
            cards.append(card[i]);
            for(int j=i;j<id.length;j++){
                if(email[i].compareTo(email[j])==0){
                    if(phone[i].compareTo(phone[j])==0){
                        if(card[i].compareTo(card[j])==0){
                        ids.append(",");
                        ids.append(j);   
                        }
                        else {
                        ids.append(",");
                        ids.append(j);                       
                        cards.append(",");
                        cards.append(card[j]);
                    }
                    }
                        ids.append(",");
                        ids.append(j);
                        phones.append(",");
                        phones.append(phone[j]);
                        cards.append(",");
                        cards.append(card[j]);
                }
                else if(phone[i].compareTo(phone[j])==0){
                    if(card[i].compareTo(card[j])==0){
                        emails.append(",");
                        emails.append(j);
                        ids.append(",");
                        ids.append(j);   
                        }
                    ids.append(",");
                    ids.append(j);
                    emails.append(",");
                    emails.append(j);
                    cards.append(",");
                    cards.append(card[j]);
                }
                else if(card[i].compareTo(card[j])==0){
                    emails.append(",");
                    emails.append(j);
                    ids.append(",");
                    ids.append(j); 
                    phones.append(",");
                    phones.append(phone[j]);
                }
            }
            Customer.setCustomer(ids.toString(),emails.toString(),phones.toString(),cards.toString());
        }
    }
}
