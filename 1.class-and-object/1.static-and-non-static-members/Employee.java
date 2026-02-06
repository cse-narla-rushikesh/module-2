class Employee {
	int id;
	String name;
	String mailid;
	long contactnumber;
	long Aadharnumber;
	long PANNumber;
	String DateofBirth;
	int age;
	String gender;
	String maritalstatus;
	static String company;
	 String branch;
	String department;
	String reportingmanager;
	String designation;
	int salary;
	String role;
	int incentive;
	long uannumber;
	int yearofexperience;
	String city;
	String state;
	static String country;


	 void displayemployeedetails(){
		System.out.println("id : "+id);
		System.out.println("Name : "+name);
	}
	 void entry(){
		System.out.println("Entered at 9:00 AM");
	}
	 void login(){
		System.out.println("Logged at 9:00 AM");
	}
	 void shortbreak(){
		System.out.println("Taking a Short Break");
	}
	 void task(){
		System.out.println("Working on the task");
	}
	void update(){
		System.out.println("Details has been updated succesfully");
	}
	 void meeting(){
		System.out.println("In the meeting.");
	}
	 void reverseKT(){
		System.out.println("Knowledge Transfer session has been done succesfully");
	}
	 void longbreak(){
		System.out.println("Enjoying the long break");
	}
	 void logout(){
		System.out.println("Logged Out");
	}
	 void exit(){
		System.out.println("Exited from the office");
	}



}