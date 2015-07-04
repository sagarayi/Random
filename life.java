import java.io.*;
 class life {

	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//System.out.print("Enter the number of elements : ");
		//int n=Integer.parseInt(br.readLine());
		int[] a=new int[1000];
		int flag=0;int i=0;
		do{
			a[i]=Integer.parseInt(br.readLine());
			
		
			if(a[i]==42)
				break;
			System.out.println(a[i]);
			i++;
	}while(i<100);
}

 }