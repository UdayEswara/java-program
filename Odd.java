public class Odd
{
	public static void main(String[] args) {
		int sum = 0;
		for(int i=7;i<=21;i++)
		{
		   if(i%2!=0)
		    sum += i;
		}
		System.out.print("sum="+sum);
	}
}
