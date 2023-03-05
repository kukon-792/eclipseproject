package collections;

import java.util.LinkedHashMap;

public class Test11 {

	public static void main(String[] args) {
		LinkedHashMap<String,Integer> t=new LinkedHashMap<String,Integer>();
		t.put("kukom", 1233);
		t.put("tanny", 2344);
		t.put("sahil", 3455);
		t.put("samit", 4567);
		t.put("sahil", 3455);
		
		System.out.println(t.keySet());
		System.out.println(t);
		System.out.println(t.values());
	}

}
