import java.util.Scanner;

public class FindOddEven {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int Num;
System.out.println("Enter A number to Find Odd/Even");
Num=s.nextInt();
if (Num%2==0)
{
	System.out.println("Entered Number" +Num +"is even");
}

else
{
	System.out.println("Entered Number" +Num +"is ODD");
}
s.close();
	}

}
