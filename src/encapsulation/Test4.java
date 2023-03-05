package encapsulation;

public class Test4 {

	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		System.out.println(b.getBankAccoutn());
		System.out.println(b.getPassWord());
		System.out.println(b.getSalary());
		System.out.println(b.getPhoneNum());
		System.out.println("33135022118");
		b.setPhoneNum("after cmangeing phonenum "+b.getPhoneNum());
		
	}

}
