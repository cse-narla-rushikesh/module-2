class JavaApplication {
	public static void execution(){
		// State t = new Telangana();
		// t.regionalLanguage();

		// State p = new Punjab();
		// p.regionalLanguage();
		// SoftwareDeveloper sd = new SoftwareDeveloper(1,"Rushi","narla@lpu.in",9346166837l,"Analyst",9876543l,"Analyst",9876543l);
		// sd.employeeInfo();
		// sd.entry();
		// sd.login();
		// sd.meeting();
		// sd.reverseKT();
		// sd.task();
		// sd.logout();
		// sd.exit();
		System.out.println(SuperInterface.c);
		SuperInterface.sm();

		System.out.println();

		System.out.println(SubConcreteClass.c);

		SubConcreteClass sc = new SubConcreteClass();
		System.out.println();

	}
}