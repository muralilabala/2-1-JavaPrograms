import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		int n1=0,n2=1,n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number of elements:");
		n=s.nextInt();
		System.out.print(n1,n2);
		for(int i=2;i<=n;i++)
		{
			count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				count=1;
			}
			if (count==0)
				System.out.println(" "+i);
		}
	}
}