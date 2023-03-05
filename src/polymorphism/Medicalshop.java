package polymorphism;

public class Medicalshop {
	public void teblet() {
		System.out.println("teblet ");
	}
  }
class fever extends Medicalshop{
	public void teblet() {
		System.out.println("fever teblet");
	}
}
class headach extends Medicalshop{
	public void teblet() {
		System.out.println("headach teblet");
	}

}
class cold extends Medicalshop{
	public void teblet() {
		System.out.println("cold teblet");
	}
}



