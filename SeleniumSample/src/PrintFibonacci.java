
public class PrintFibonacci {

	public static void main(String[] args) {
int i=0;
int j=1,z;
int temp;
//int N=100;
System.out.print(i +","+j);


for (z=2;z<10;++z)
{

	//System.out.println(i);
	temp=i+j;
	System.out.print(","+temp);
    i=j;
	j=temp;

}

	}

}
