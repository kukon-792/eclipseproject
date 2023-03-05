package constructor;

public class Test0 {
	
	Test0(String b){
		System.out.println("String");
	}

	Test0(double b, int a, String c){
		System.out.println("double  and integer and String");
	}
	
	
	public static void main(String[] args) {
		Test0 t=new Test0("This is kukon");
		Test0 a=new Test0(345.678, 2, "my name is kukon");

	}

}
