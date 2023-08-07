import java.util.Scanner;


public class DownloadMoreRAM {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0)
        {
        	int n=s.nextInt();
	        int k=s.nextInt();
	        int[] a  = new int[n];
	        int[] b  = new int[n];
	        for(int i=0;i<n;i++)
	        {
	        	a[i] =s.nextInt();
	        }
	        for(int i=0;i<n;i++)
	        {
	        	b[i] =s.nextInt();
	        }
	        System.out.println(DownloadMoreRAM.Solution(a, b, n,k));
        }
        
}
	public static int Solution(int[] a,int[] b , int n , int k) {
		Sort(a,b,n);
		int i =0;
		while(i<n && k>=a[i])
		{
			k+=b[i++];		
		}
		return k;
	}
	private static void Sort(int[] a,int[] b , int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j+1];
					a[j+1]= a[j];
					a[j] = temp;
					temp = b[j+1];
					b[j+1]= b[j];
					b[j] = temp;
				}
			}
		}
	}
}
