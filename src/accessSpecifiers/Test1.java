package accessSpecifiers;

public class Test1 {
	int a=10;
	Test1(){
		System.out.println("this is my numbers");
	}

	public void banana() {
		System.out.println("This is my banana");
	}

	public void mangu() {
		System.out.println("this is my mangu");
	}
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.banana();
		t.mangu();
		System.out.println("this is my numbers "+t.a);
	}

}
