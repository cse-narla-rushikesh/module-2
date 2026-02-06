class JavaApplication {
    public static void upcastingDowncasting(){
        Employee employee;//generic Container
        employee = new SoftwareDeveloper();

        employee.entry();
        employee.login();
        employee.shortBreak();
        employee.meeting();
        employee.lunchBreak();
        employee.logout();
        employee.exit();

        //specific container
        SoftwareDeveloper softwareDeveloper = (SoftwareDeveloper)employee;
        softwareDeveloper.displaySoftwareDeveloperInfo();
        softwareDeveloper.reverseKT();
        softwareDeveloper.task();

        System.out.println();

        employee = new SoftwareTester();
        employee.entry();
        employee.login();
        employee.shortBreak();
        employee.meeting();
        employee.lunchBreak();
        employee.logout();
        employee.exit();
        
        //specific container
        SoftwareTester softwareTester = (SoftwareTester)employee;
        softwareTester.displaySoftwareTesterInfo();
        softwareTester.reverseKT();
        softwareTester.task();

        
    }
}