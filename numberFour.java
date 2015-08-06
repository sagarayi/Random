package dataStructures;
import java.io.*;/*Geeks for geeks find the digits containing the digit 4 till n digits*/
public class numberFour {
	public static boolean isPresent(int n)
	{
		int d=0;boolean res=false;
		while(n!=0)
		{
			d=n%10;
			if(d==4)
				res=true;
			n=n/10;
		}
		return res;
	}
	public static int calc(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(isPresent(i))
				count++;
			
		}
		return count;
			
	}
	public static void main(String []args)throws IOException
	{
		long startTime = System.currentTimeMillis();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the limit");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Number of digits are :"+calc(n));
		long endTime = System.currentTimeMillis();
		System.out.println("Took "+(endTime - startTime) + " ms"); 
	}

}