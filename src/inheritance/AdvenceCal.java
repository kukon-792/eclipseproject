package inheritance;

public class AdvenceCal extends BesicCal {
	
	public void sinTeta() {
		System.out.println("sinteta");
	}

	public void cosTeta() {
		System.out.println("costeta");
	}
	public static void main(String[] args) {
		AdvenceCal c=new AdvenceCal();
		c.sinTeta();
		c.cosTeta();
		c.add(10,80);
		c.sub(70,50);
		
		

	}

}
