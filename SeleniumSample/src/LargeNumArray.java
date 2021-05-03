import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LargeNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,4,5,6,7};
		int i;
		int size = a.length;
		String s = "Haris is good boy";
		String b = s.replaceAll("\\s", "");
		Arrays.sort(a);

		Set<Integer> st = new HashSet<Integer>();
		int k;
		for (k = 0; k < 6; k++) {
			st.add(a[k]);
		}
		System.out.println("set is" + st);
 
		System.out.println("Largest Num in Array is" + a[size - 1]);

		System.out.println("second Largest Num in Array is" + a[size - 2]);

		System.out.println(b);
		char[] c = s.toCharArray();
		// System.out.println(s[0]);
		System.out.println(c[0]);
		HashMap<Character, Integer> HM = new HashMap<Character, Integer>();
		// char j=0;
		for (char d : c) {
			if (HM.containsKey(d))
				HM.put(d, HM.get(d) + 1);
		}
		System.out.println(HM);
	}

}
