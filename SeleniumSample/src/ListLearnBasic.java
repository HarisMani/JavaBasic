import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ListLearnBasic {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<String> StrList = new ArrayList<String>();
		LinkedList<Integer> linklist = new LinkedList<Integer>();
		linklist.addFirst(2);
		linklist.add(56);
		linklist.addLast(4);
		int linlissiz=linklist.size();
		System.out.println("List is "+linklist+ " size is "+linlissiz);
		list.add(1);
		list.add(8);
		System.out.println("List is" + list);
		list.remove(1);
		System.out.println("List is" + list);
		list.clear();
		System.out.println("List is" + list);
		list.add(0, 5);
		System.out.println("List is" + list);
		System.out.println("Printing Particular index element");
		System.out.println(list.get(0));
		list.add(1, 3);
		list.add(2, 3);
		System.out.println("LIST SIZE IS " + list.size());
		System.out.println("List is" + list);
		Collections.sort(list);
		System.out.println("SORTED List is" + list);
		Collections.reverse(list);
		System.out.println("Reverse Sort List is" + list);
String str="Welcome Program";
StrList.add(str);
StrList.add("MANI");
StrList.add("APPLE");
if(StrList.contains("Welcome Program"))
	System.out.println("YES");
else
	System.out.println("NO");

System.out.println(StrList);
Collections.sort(StrList);
System.out.println(StrList);
Collections.sort(StrList, Collections.reverseOrder());   
System.out.println(StrList);


	}
}
