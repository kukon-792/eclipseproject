package encapsulation;

public class BankAccount {
	
	private String  BankAccoutn = "chase bank";
	private int passWord = 3456;
	private double salary = 23.345;
	private String phoneNum = "9807654321";
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getBankAccoutn() {
		return BankAccoutn;
	}
	public int getPassWord() {
		return passWord;
	}
	public double getSalary() {
		return salary;
	}
	

}
