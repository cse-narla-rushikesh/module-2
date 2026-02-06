interface Interface {
	public static void sm(){
		System.out.println("Static sm() of inerface Interface");
	}
	public default void nsm1() {
		System.out.println("non static nsm1() of interface Interface");
	}
	public void nsm2();
}