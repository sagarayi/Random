/*
 Question: Find the first and the second largest  element in an array of 'n' elements
 */
import java.io.*;
public class large {
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the number of elements: ");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Enter the numbers");
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(br.readLine());
		int x=a[0];
		int y=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]>y )
			{
				
			
			 if( a[i]>x)
			 {
				y=x;
				x=a[i];
			 }
			 else
				 y=a[i];
			}
		}
		System.out.println("The First largest : "+ x);
		System.out.println("The Second largest : "+ y);
	}

}
