package encapsulation;

public class Test2 {

	public static void main(String[] args) {
		StudentDetail s=new StudentDetail();
		System.out.println(s.getStudentName());
		System.out.println(s.getPassword());
		s.setPassword(45678);
		System.out.println("After changeing password "+s.getPassword());
		System.out.println(s.getAge());
		System.out.println(s.getPhonenumber());
		s.setPhonenumber("5678906543");
		System.out.println("After changeing phonenum "+s.getPhonenumber());
		System.out.println(s.getSalary());
		
	}

}
