package inheritance;

public class Child extends Parent {
	
	public void bike() {
		System.out.println("bike property on child");
	}

	public static void main(String[] args) {
		Child c=new Child();
		c.bike();
		c.car();
		c.home();

	}

}
