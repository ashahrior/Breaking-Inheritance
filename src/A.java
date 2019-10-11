class A {
	private int a_variable;

	public A() {
		System.out.println("In constructor A");
	}
	
	void printA() {
		System.out.println("Only in A");
	}
	
	void print() {
		System.out.println("In print A");
	}


	private void privateMethodinA() // this method can't be called outside it's class
	{
		System.out.println("This is a private method in A invoked by another non-private method");
	}

	protected void protectedMethodinA() {
		System.out.println("This is a protected method in A");
	}

	public int getA_variable() {
		return a_variable;
	}

	public void setA_variable(int a_variable) {
		this.a_variable = a_variable;
	}

	void callingPrivateMethodinA() {
		privateMethodinA();
	}

}