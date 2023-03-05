package constructor;

public class Demo {
	
	Demo(String b){
		System.out.println("String");
	}

	Demo(double c, String a, int b){
		System.out.println("Double string and integer");
	}
	
	Demo(String a, int b, double c){
		System.out.println("String int and double");
	}
	
	public static void main(String[] args) {
		Demo d=new Demo("hello ge", 10, 23.45);
		Demo d1=new Demo(23.45, "hi", 33);

	}

}
