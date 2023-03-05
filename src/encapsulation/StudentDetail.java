package encapsulation;

public class StudentDetail {
	
	private String studentName="kukon";
	private int password = 2345;
	private int age=34;
	private String phonenumber="3135022118";
	private double salary=90.567;
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}

}
