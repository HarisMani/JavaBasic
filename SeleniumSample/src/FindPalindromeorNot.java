public class FindPalindromeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i;
		String name="madam";
	     int size=name.length();
		char []NameChar1=name.toCharArray();
		String rev="";
    	
for (i=size-1;i>=0;i--)
	rev=rev+NameChar1[i];
	
if (rev.equals(name))
	System.out.println(name +" is a PALINDROME");
else
	System.out.println(name +" is NOT A PALINDROME");
	}
}

//System.out.println(rev);
		/*for(i=0,j=size;i<size;i++,j--)
	    {
     System.out.println("STR1" +NameChar1[i]);
  		
  	if(j>0)
		{
		NameChar2[i]=NameChar1[j-1];
	    System.out.println("STR2" +NameChar2[i]);
		}
	}
	*/


//if (flag==size)
//System.out.println("Palindrom");
//else
//System.out.println("Not Palin");


/*
 * if(NameChar1[i]==NameChar2[j-1]) { flag+=1; continue;
 * 
 * } else { break; }
 */