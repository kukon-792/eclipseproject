package encapsulation;

public class EmployeeDetails {
	
	private String empName = "kukon";
	private double salary = 80.456;
	private int age = 30;
	private int phoneNumber = 1234567888;
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmpName() {
		return empName;
	}
	public double getSalary() {
		return salary;
	}
	public int getAge() {
		return age;
	}

}
