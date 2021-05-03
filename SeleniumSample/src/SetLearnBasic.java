import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetLearnBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set<String> set1 = new LinkedHashSet<String>();   
        Set<String> set2 = new TreeSet<String>();   
        Set<String> set3 = new HashSet<String>();  
        set1.add("Haris");
        set2.add("Good");
        set3.add("boy");
        System.out.println(set1);System.out.println(set2);System.out.println(set3);
        
        Set<Integer> set4 = new LinkedHashSet<Integer>();   
        Set<Integer> set5 = new TreeSet<Integer>();   
        Set<Integer> set6 = new HashSet<Integer>();  
        set4.add(16);set4.add(15);set4.add(16);
        set5.add(14);
        set6.add(12);
        System.out.println(set4);System.out.println(set5);System.out.println(set6);

        
	}

}
