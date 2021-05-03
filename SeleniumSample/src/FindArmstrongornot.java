
public class FindArmstrongornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int a,b=0,c;
		c=n;
		while(n>0)
		{
			System.out.println("Printing n value befor LOOP" +n);
			a=n%10;
			System.out.println("Printing a value" +a);
			n=n/10;
			System.out.println("Printing n value" +n);
			b+=(a*a*a);
			System.out.println("Printing b value" +b);
		}
		
		if (c==b)
			System.out.println(c+"Amstrong");
		else
			System.out.println(c+ "Not a Armstrong");

	}

}
