package ExceptionHandiling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test5 {
	public void demo() {
		try {
		FileInputStream f=new FileInputStream("./d");
		}
	    catch(Exception a) {
	    	System.out.println("handled");
	    }
	    	
	    }

	public static void main(String[] args) {
		Test5 t=new Test5();
		t.demo();

	}

}
