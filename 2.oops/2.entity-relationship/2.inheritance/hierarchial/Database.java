class Database{
	public String url;
	public String username;
	public String password;
	public static void connection(){
		System.out.println("Database connected!");
	}
	public void disconnection(){
		System.out.println("Database disconnected!");
	}
}