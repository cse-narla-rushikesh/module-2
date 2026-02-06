class Sub extends Super{
	pubic String nsv = "Sub";
	public void nsm(){
		System.out.println("nsm() of class Sub");
	}

	public void displaySubClassInfo(){
		System.out.println("SubClassInfo");
		System.out.println(this.nsv);
		this.nsm();
		System.out.println();
	}

	public void displaySuperClassInfo(){
		System.out.println("SuperClassInfo");
		System.out.println(super.nsv);
		super.nsm();
		System.out.println();
	}

}