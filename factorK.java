package dataStructures;
import java.io.*;//Cocubes coding round question's solution 
public class factorK {
	public int divideBy(int n,int k)
	{
		int count=0;
		while((n%k)==0)
		{
			n=n/k;
			count ++;
		}
		return count;
	}
	public void calc(int []arr,int k)
	{
		int len=arr.length,temp;
		int []factors=new int[len];
		for(int i=0;i<len;i++)
		{
			factors[i]=divideBy(arr[i],k);
		}
		
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				if(factors[j]<factors[i])
				{
					temp=factors[i];
					factors[i]=factors[j];
					factors[j]=temp;
				}
			}
			
			System.out.println(factors[i]);
		}
		System.out.println("The array elements are :");
		for(int i=0;i<len;i++)
			System.out.println(factors[i]);
		
	}
	public static void main(String []args)
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.print("enter the array length :");
			int n=Integer.parseInt(br.readLine());
			int []a=new int[n]; 
			for(int i=0;i<n;i++)
				a[i]=Integer.parseInt(br.readLine());
			System.out.print("Enter the divisor :");
			int k=Integer.parseInt(br.readLine());
			factorK f=new factorK();
			f.calc(a, k);
			
		}
		catch(Exception e)
		{
			System.out.println("The error is bro "+e);
		}
	}

}
