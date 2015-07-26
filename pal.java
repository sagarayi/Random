/*
 * ToGiven a string S, count the number of non empty sub strings that are palindromes. 
A sub-string is any continuous sequence of characters in the string. 
A string is said to be palindrome, if the reverse of the string is same as itself. 
Two sub strings are different if they occur at different positions in S
 */

package random;
import java.io.*;

public class pal {
    public static boolean isPal(String s1)
    {
        String s2="";
        int len=s1.length();
        for(int i=len-1;i>=0;i--)
            s2=s2+s1.charAt(i);
        if(s1.equals(s2))
        {
            System.out.println("First :"+s1);
        System.out.println("Second :"+s2);
            return true;
        }
         //System.out.println("First :"+s1);
        //System.out.print("Second :"+s2);
        return false;
        
    }
    public static void main(String []args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter the String : ");
        String str=br.readLine();//reading the string
        int len=str.length();
       int count=0;
        boolean result=false;
        
        for(int i=0;i<len;i++)
            for(int j=i+1;j<=len;j++)
            {
                
                //System.out.println(count);
                String temp=str.substring(i,j);
                if(temp.isEmpty())
                {
                    System.out.println(i);
                System.out.println(j);
                }
                System.out.println("String :"+temp);
                result=isPal(temp);
                 if(result == true)
                 {
                     result=false;
                    count++;
                 }
            }
       System.out.println("Count : "+count);
    }
    
}
