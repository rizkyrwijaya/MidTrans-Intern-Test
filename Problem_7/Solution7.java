/**
 * Class main dari solution problem 7 
 * 
 * @author Rizky Ramadian Wijaya
 * @version 6 April 2018
 */

import java.util.*;

public class Solution7
{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("input: ");
        String name = "";
        String func = "";
        int count;
        int loop = input.nextInt();
        int findcount = -1;
        String[] data = new String[loop];
        for(int i = 0;i<loop;i++){
            System.out.print("input: number of inputs: ");
            func = input.next();
            name = input.next();
            
            if(func.compareTo("add")==0){
                data[i] = name;
            }
            if(func.compareTo("find")==0)
            {
                count = 0;
                findcount++;
                for(int j = 0;j<i-findcount;j++){
                    if(data[j].startsWith(name))count++;
                }
                System.out.println(count + " # " + "because there are "+count+" names started with '" +name+"'");
            }
        }
        System.out.println("Program has finished");
    }
}
