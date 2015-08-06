package dataStructures;
import java.io.*;/*Geeks for geeks factorial question*/
public class fact {
	public static int factorial(int n)
	{
		if(n==0)
			return 1;
		else
		{
			return n*factorial(n-1);
		}
	}
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the max limit:");
		int max=Integer.parseInt(br.readLine());
		System.out.print("Enter the min limit:");
		int min=Integer.parseInt(br.readLine());
		int count =0,i=1,facto=factorial(i);
		while(facto<=max)
		{
			if(facto>=min && facto<=max )
			{
				System.out.println(facto);
				count++;
			}
			i++;
			facto=factorial(i);
		}
		System.out.println("Total = "+count);
		//System.out.println("Factorial : "+factorial(n));
	}
}
