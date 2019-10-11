class C {
	public C() {
		System.out.println("Constructed C");
	}

	void print() {
		System.out.println("In print C");
	}
	
	protected static void cProtected()
	{
		System.out.println("Static and Protected() in C");
	}
	private static void ss()
	{
		
	}
	/*public static void main(String[] args) {
		System.out.println("This is main C");
		C.ss();
		C.cProtected();
	}*/
	
}
