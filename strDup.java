
package random;
import java.io.*;
/**
 *
 * Program to find out duplicates in a string without using additional data 
 * structure
 */
public class strDup {
    public static void main(String []args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the String :");
        String s1=br.readLine();
        int len=s1.length();
        int count=0;
        for(int i=0;i<len;i++)
            for(int j=i+1;j<len;j++)
                if(s1.charAt(i)==s1.charAt(j))
                {
                    count=1;
                    break;
                }
        if(count==1)
        {
            System.out.println("Dup");
        }
        else
        {
            System.out.println(" No Dup");
        }
    }
}
