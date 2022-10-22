import java.util.*;
class Fibonacci
{
	public static void main(String args[])
	{
	fib s=new fib();
	s.fib();
	}
}
class fib
{
int n1=0,n2=1,n,n3;
	void fib()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number of elements:");
		n=s.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		for(short i=2;i<=n;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
}