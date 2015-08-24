import java.io.*;

class decbin
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int n=Integer.parseInt(br.readLine());
		decbin d=new decbin();
		d.rec(n);
	}
	void rec(int n)
	{
		if(n==1||n==0)
		{
			System.out.print(n);
			return ;
		}
		rec(n/2);
		System.out.print(n%2);
	}
}