class JavaApplication{
	public static void execution() {
		Parent p = new Parent();
		System.out.println(p instanceof Parent);
		System.out.println(p instanceof Child);
                                                                            
		Child c = new Child();                        
		System.out.println(c instanceof Child);     
		System.out.println(c instanceof Parent);  
	}
}