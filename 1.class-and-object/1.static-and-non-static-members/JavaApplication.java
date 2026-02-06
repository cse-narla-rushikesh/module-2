import java.util.Scanner;
class JavaApplication {

	public static Student student;
	public static void execution(){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		boolean condition = true;
		do{
		System.out.println("Eenter your choice: ");
		System.out.println("----------------------");
		System.out.println("1. Create");
		System.out.println("2. Insert");
		System.out.println("3. Read");
		System.out.println("4. Update");
		System.out.println("5. Delete");
		System.out.println("6. Exit");
		int choice = sc.nextInt();
		switch(choice){
		case 1:{
			student = new Student();
			System.out.println("You choosed Create Option!!!");
		}
		break;
		case 2:{
		System.out.println("You choosed Insert Option!!!");
		System.out.println("Enter the Student ID: ");
		student.id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Student Name: ");
		student.name = sc.nextLine();
		System.out.println("Enter the Student MailID: ");
		student.mailId = sc.next();
		System.out.println("Enter the Student Contact Number: ");
		student.contactNumber = sc.nextLong();
		System.out.println("Data Inserted Succesfully");
		}
		break;
		case 3:{
		student.displayStudentDetails();
		System.out.println("Student Details Displayed Successfully");
		}
		break;
		case 4:{
		System.out.println("Enter student MailId: ");
		student.mailId = sc.next();
		}
		break;
		case 5:{
			student = null;
			System.out.println("Deleted Succesfully!!");
		}
		break;
		case 6:{
			condition = false;
		}
		break;
		default:
			System.out.println("Enter Correct Option!!!!");
		}
		}while(condition);
}
}