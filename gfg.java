import java.io.*;
public class gfg
{
	int rotate(int []arr,int start,int count)
	{
		int i=start,sum=0;
		int len=count;
		start=0;
		while(count!=0)
		{
			if((i%len)==0)
			{
				i=0;
			}
			sum+=start*arr[i];
			System.out.println(" Inside Sum is  = "+sum);
			i++;
			start++;
			count--;
		}
		System.out.println(" Returning Sum is  = "+sum);
		return sum;
	}
	public static void main(String []args)throws IOException
	{
		gfg obj=new gfg();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length of the array");
		int len=Integer.parseInt(br.readLine());
		int count=len;
		int []arr=new int[len];
		System.out.println("Enter the digits ");
		for(int i=0;i<len;i++)
			arr[i]=Integer.parseInt(br.readLine());
		int temp=0,sum=0,i=0;
		while(len!=0)
		{
			temp=obj.rotate(arr,i,count);
			i++;
			len--;
			if(temp>sum)
				sum=temp;
		}
		System.out.println("Sum = "+sum);
	}
} 