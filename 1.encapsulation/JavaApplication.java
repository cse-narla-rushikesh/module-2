import java.util.Scanner;
class JavaApplication{
	static GmailAccount obj;
	public static void execute(){
		// Student obj = new Student();
		// System.out.println(obj.getId());
		// obj.setId(40);
		// System.out.println(obj.getId());
		// System.out.println(obj.getName());
		// obj.setName("Bharat");
		// System.out.println(obj.getName());

		//CRUD Operations using pojo class
		boolean condition = true;

		do{
		System.out.println("Enter you choice : ");
		System.out.println("-----------------------");
		System.out.println("1. Create");
		System.out.println("2. Insert");
		System.out.println("3. Read");
		System.out.println("4. Update");
		System.out.println("5. Delete");
		System.out.println("6. Exit");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice){
		case 1:{
			obj = new GmailAccount();
			System.out.println("Object created successfully!!");
		}
		break;
	case 2:{
		System.out.println("Enter FirstName: ");
		String fn = sc.next();
		System.out.println("Enter LastName : ");
		String ln = sc.next();
		System.out.println("ContactNumber : ");
		Long cn = sc.nextLong();
		System.out.println("Mail ID : ");
		String mail = sc.next();
		System.out.println("Password: ");
		String pass = sc.next();
		obj.setDetails(fn,ln,cn,mail,pass);
		System.out.println("Inserted Successfully");
	}
	break;
case 3:{
	obj.showDetails();
}
break;
case 4:{
	obj.updateDetails("contactNumber", "123456789");
	System.out.println("Updated successfully!!!");
}
break;
case 5:{
	obj = null;
	System.out.println("Deleted succesfully");
}
break;
case 6:{
	condition = false;
	break;
}
		}
		}while(condition);

	}
}