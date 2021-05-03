import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapLearnBasic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Map<String,Integer> map1 = new LinkedHashMap<String,Integer>();   
	        Map<String,Integer> map2 = new TreeMap<String,Integer>();   
	        Map<String,String> map3 = new HashMap<String,String>();
	        Map<Integer,String> map4 = new LinkedHashMap<Integer,String>();   
	        Map<Integer,String> map5 = new TreeMap<Integer,String>();   
	    
	        map1.put("abc",1);
	        
	        map2.put("tsp",1);
	        map2.put("har",2);
	        
	        map3.put("str","");
	        map3.put("str","");
	        System.out.println(map1);System.out.println(map2);System.out.println(map3);        
	}


}
