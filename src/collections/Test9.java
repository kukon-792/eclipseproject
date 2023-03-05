package collections;

import java.util.TreeMap;

public class Test9 {

	public static void main(String[] args) {
		TreeMap<String,Integer> t=new TreeMap<String,Integer>();
		t.put("kukom", 1233);
		t.put("tanny", 2344);
		t.put("sahil", 3455);
		t.put("samit", 4567);
		t.put("sahil", 3455);
		
		System.out.println(t);

	}

}
