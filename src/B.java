class B extends A {
	private int b_variable;

	public B() {
		// super();
		System.out.println("In constructor B");
	}

	void print() {
		System.out.println("In print B");
	}

	void printB() {
		System.out.println("In B 2");
	}

	public int getB_variable() {
		return b_variable;
	}

	public void setB_variable(int b_variable) {
		this.b_variable = b_variable;
	}
}
