package ExceptionHandiling;

public class Test0 {

	public static void main(String[] args) {
		try {
		int i=1/0;
		}
		catch(ArithmeticException a) {
		System.out.println("Handled");
		}

	}

}
