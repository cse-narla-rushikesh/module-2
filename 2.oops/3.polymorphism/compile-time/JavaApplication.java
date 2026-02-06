class JavaApplication{
	public static void execution(){
		Student std1 = new Student("Rushi",'M',"21/09/2004");
		std1.displayStudentDetails();
		Student std2 = new Student("Rushi",'M',"21/09/2004","abc@gmail.com");
		std2.displayStudentDetails();
		Student std3 = new Student("Rushi",'M',"21/09/2004","abc@gmail.com",7894561230L);
		std3.displayStudentDetails();
	}
}