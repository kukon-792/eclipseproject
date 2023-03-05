package constructor;

public class Add {
	
	Add(int a, int b){
		System.out.println(a * b);
	}
	
	Add(int a, double b){
		System.out.println(a + b);
	}

	Add(int a, int b, int c){
		System.out.println(a - b - c );
	}
	
	
	public static void main(String[] args) {
		Add a=new Add(10,30);
		new Add(20,30);
		Add a1=new Add(40, 33.45);
		Add a2=new Add(60,20,30);

	}

}
