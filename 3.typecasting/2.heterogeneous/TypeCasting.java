class TypeCasting {
	public static void boxing() {
		int i = 10;
		System.out.println("i is : "+i);
		Integer I = Integer.valueOf(i);
		System.out.println("I is : "+I);
		System.out.println();
	}

	public static void autoboxing() {
		int j = 20;
		System.out.println("j is : "+j);
		Integer J = j;
		System.out.println("I is : "+J);
		System.out.println();
	}

	public static void unboxing() {
		Double D = Double.valueof(12.34);
		System.out.println("D is : "+D);
		double d = new D.doubleValue();
		System.out.println("d is : "+d);
		System.out.println();
	}

	public static void autoboxing() {
		Double D = Double.valueOf(12.34);
		System.out.println("D is : "+D);
		double d = D;
		System.out.println("d is : "+d);
		System.out.println();
	}
}