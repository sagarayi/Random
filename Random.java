/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package random;

/**
 *
 * @author Admin
 */
import java.io.*;
public class Random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a text : ");
        String txt=br.readLine();
        System.out.print("Enter a Pattern : ");
        String pat=br.readLine();
        int counter=0,pos=0;
        for(int i=0;i<txt.length();i++)
        {//int j;
           if(txt.charAt(i) == pat.charAt(0) )
           {
               counter=1;pos=i;
               for(int j=1;j<(pat.length());j++)
               {
                   if(txt.charAt(i+j)!=pat.charAt(j))
                   {
                       break;
                   }
                   counter++;
               }
           }
            if(counter==pat.length())
            {
                System.out.println("Pattern Found at"+pos);
                break;
            
            }
        }
       
        
            
    }
    
}
