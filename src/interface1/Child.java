package interface1;

public class Child implements parent1,parent2{

	@Override
	public void home() {
		System.out.println("home");
	}

	@Override
	public void car() {
		System.out.println("car");
		
	}
 
	public static void main(String[]args) {
		Child c=new Child();
		c.car();
		c.home();
		
	}
}
