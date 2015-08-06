package dataStructures;
import java.io.*;/*Geeks for geeks find the sum of digits of numbers from 1 to n */
public class sumOfDigits {
	public static int indiSum(int n)
	{
		int d,sum=0;
		while(n!=0)
		{
			d=n%10;
			sum+=d;
			n=n/10;
		}
		return sum;
	}
	public static int totalSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
			sum+=indiSum(i);
		return sum;
	}
	public static void main(String []args)throws IOException
	{
		long startTime = System.currentTimeMillis();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the limit");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Sum of digits is :"+totalSum(n));
		long endTime = System.currentTimeMillis();
		System.out.println("Took "+(endTime - startTime) + " ms"); 
	}

}
