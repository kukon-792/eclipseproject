package typecasting;

public class Banana extends Mango {
	
	public void softdrink() {
		System.out.println("softdrink");
	}

	public static void main(String[] args) {
		Mango m=new Banana();
		m.hotmilk();
		m.coldmilk();
		Banana b=(Banana)m;
		b.softdrink();
		b.hotmilk();
		b.coldmilk();

	}

}
