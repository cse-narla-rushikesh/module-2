class Employee {
    int id;
    String name;
    String emailId;
    Long contactNumber;
    static String city;
    static String state;
    static String country;

    public static void entry(){
        System.out.println("Employee can enter into the Campus");
    }
    public static void login(){
        System.out.println("Employee can login into the Office");
    }
    public static void shortBreak(){
        System.out.println("Employee went for tea");
    }
    public static void meeting(){
        System.out.println("Employee is in meeting");
    }
    public static void lunchBreak(){
        System.out.println("Employee went for lunch");
    }
    public static void logout(){
        System.out.println("Employee can logout from the Office");
    }
    public static void exit(){
        System.out.println("Employee can exit from the Campus");
    }
}