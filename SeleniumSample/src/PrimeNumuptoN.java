
public class PrimeNumuptoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num=100;
		int i;
		for (i=2;i<Num;i++)
		{
	          if ((i%2!=0)&&(i%3!=0)&&(i%5!=0))
	          {
	        	  System.out.println(i);
	          }
	          else if(i==2||i==3||i==5)
	        	  System.out.println(i);
			}
	}
}


/*for (j=2;j<=i;j++)
{
//System.out.println(+Num);
  if(i%j!=0)
	System.out.println(i);
	
}	
}
*/

