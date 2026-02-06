class Son extends Father{
	// @Override
	// public void career(){
	// 	System.out.println("Future Doctor");
	// }

	// @Override
	// public void marriage(){
	// 	System.out.println("Love Marriage");
	// }

	@Override
	public ScientificCalculator buyCalculator() {
		return new ScientificCalculator();
	}
}


