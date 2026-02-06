import java.lang.Object;
class Student extends Object{
	String name;
	String mailId;
	long contactNumber;
	String dob;
	char gender;
	Student(String name, char gender, String dob){
		super();
		this.name = name;
		this.gender = gender;
		this.dob = dob;
	}
	Student(String name, char gender, String dob, String mailId){
		this(name,gender,dob);
		this.mailId = mailId;
	}
	Student(String name, char gender, String dob, String mailId, long contactNumber){
		this(name,gender,dob,mailId);
		this.contactNumber = contactNumber;
	}
	public void displayStudentDetails(){
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("DOB : "+dob);
		System.out.println("mailID : "+mailId);
		System.out.println("contactNumber : "+contactNumber);
	}
}