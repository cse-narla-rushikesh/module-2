class JavaApplication{
	public static void execution() {
		Student student = new Student(1,"Narla Rushikesh","narla@gmail.com",7418529630l);
		student.displayStudentInfo();

		Project project = new Project(1,"Ecommerce - Website","Java based Applicatoin");
		student.setProject(project);
		student.readProject();

		student.updateProject(1,"Air-Line Services website","JavaScript based Applicatoin");
		student.readProject();

		student.deleteProject(1);
		student.readProject();



	}
}