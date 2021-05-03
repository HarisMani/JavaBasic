
public class FindPrimeNumorNot {
public static void main(String[] args) {
	int Num=87;
	int i;
	int flag=0;
	for (i=2;i<Num;i++)
		{
		//System.out.println(+Num);
		if(Num%i==0)
		{
			System.out.println("It is divided by"+i +"soItis not prime");
			flag+=1;
			break;
		}
	
		}
	if (flag==0)
		System.out.println("It is prime");
	else
		System.out.println("Non Prime");
}
}
