class Dummy {

}

/*
 * I have tried out this code to dismiss my confusion regarding INHERITANCE in
 * java. 
 * In a single source file there can be not more than one public class.
 * The source file name and the class name containing the main() has to be same.
 * For instance here Test class contains main() and hence the source file name
 * is Test.java file. 
 * A public class and it's source file name has to be same.
 * Here if I declare the Dummy class public then it'll give me an error. If I
 * rename the class Test to Testt then there will be no warnings or error shown
 * on the IDE. But it will give -
 * "Error: Could not find or load main class randomStuffs.Test" So any source
 * file that is to load main() must have a class named as same as the source
 * file. 
 * Here if I keep the name Testt class in Test.java file and create a
 * main() in C.java then the main() in C class will take the driving role.
 * Because the name of the file and class name is found same.
 * 
 */

public class Test {

	private static void introduction() {
		System.out.println("Breaking INHERITANCE");
		for (int i = 1; i <= 30; i++)
			System.out.print("- ");
		System.out.println();
		System.out.println();
		
		return;
	}
	
	private static void testParentToChildUpcasting()	{
		A ab = new B(); // this is upcasting
		/*
		 * Here ab reference object variable is created
		 * It ab is of type A and it is assigned an object of type B
		 * Any parent class type variable can hold its child class type object
		 * when ab created, it will first invoke variable type A's constructor then to B's constructor
		 * ab can only access the properties of its variable type that is A. It can't access any attribute from B.
		 * But if B has any method of the same name like any in A and the method in B overrides the method in A
		 * then ab will invoke the method in B.
		 */
		System.out.println();
		
		/*
		 * print() function is available in both A and B. So ab will invoke the one in B that has overridden A.
		 */
		ab.print(); 
		System.out.println(ab.getClass());
		System.out.println(ab.getClass().getSuperclass());
		/*
		 * ab has no access to print2() method located in B.
		 */
		// ab.print2(); 
		ab.setA_variable(67);
		System.out.println(ab.getA_variable());
		/*
		 * ab has direct access to its parent class A's protected properties
		 */
		ab.protectedMethodinA();
		ab.callingPrivateMethodinA();

		System.out.println();
		
		return;
	}
	
	private static void testDowncasting() {
		/*
		 * The following declaration is invalid.
		 * Child class type reference variable can't hold parent class type object.
		 */
		// B ba = new A();
		
		/*
		 * Here we created a B type object with A type reference variable.
		 * From what we have learned, ba shouldn't be able to access properties of B class
		 */
		A ba = new B();
		
		/*
		 * But if downcasting is performed than this issue could be solved
		 * Here ba is being downcasted
		 */
		
		/*
		 * instanceof - is used to check that whether is ba is of the parent class
		 * ba requireds a parent-child relationship in order to downcast it to it's child class
		 */
		if(ba instanceof A) {
			((B)ba).printB();	

			/* this is downcasting. ba is being type casted with B.
			 * Hence gaining access to properties of class B
			 */
		}
		System.out.println();
		
		return;
	}
	
	private static void typeCasting() {
		
		A a = new A();
		B b = new B();
		
		/*
		 * Since B is a child of A. The following typecasting of b is unnecessary.
		 * b can acess A properties naturally.
		 */
		((A)b).printA();
		
		/*
		 * The following line will throw an exception.
		 * The parent class A's instance can't be cast to B
		 */
		
		//((B)a).printB();

		System.out.println();
		
		return;
		
	}
	
	private static void testA() {
		A a = new A();
		
		/*
		 * a can't access its own private properties if invoked outside its own class. 
		 * Here a is trying to access its private property a_variable but it can't.
		 * a_variable can be manipulated inside class A. But this is inside class Test.
		 */
		//a.a_variable = 2;
		
		a.setA_variable(3);
		System.out.println(a.getA_variable());
		
		// a can access its non-private properties outside the class without any problem
		
		a.protectedMethodinA();
		
		a.callingPrivateMethodinA();

		return;
	}
	
	private static void testB() {
		B b = new B();
		/*
		 * when b is created, it will first invoke parent class A's constructor then to its own B's constructor
		 */
		System.out.println();
		
		/*
		 * child class B object can access parent class A's printA() method
		 */
		b.printA();
		/*
		 * child class B object will invoke override parent class A's print() method
		 */
		b.print();
		
		b.printB();	// print2() belongs to B only
		/*
		 * child class B object b can use setters of A to set value for its private variable 
		 */
		b.setA_variable(78);
		System.out.println("Set by a B type object a = " + b.getA_variable());
		
		/*
		 * child class B object b can access parent class A's protected properties
		 */
		b.protectedMethodinA();
		
		b.callingPrivateMethodinA();
		System.out.println(b.getClass());
		System.out.println(b.getClass().getSuperclass());
		System.out.println();
		
		return;
	}
	
	private static void testC() {
		C c = new C();
		System.out.println();

		c.print();
		
		/*
		 * static protected properties can be invoked without any problem
		 */
		C.cProtected();
		
		System.out.println(c.getClass());
		System.out.println(c.getClass().getSuperclass());
		System.out.println();
		
		return;
	}

	public static void main(String[] args) {

		/*
		 * introduction() method, declared as private, can only and only be invoked within Test class
		 * It can't be invoked outside its class.
		 */

		Test.introduction();	// since introduction is a static function, no object declaration is required to invoke
		
		Test.testParentToChildUpcasting();
		
		Test.testDowncasting();
		
		Test.typeCasting();
		
		Test.testA();
		
		Test.testB();
		
		Test.testC();

	}

}
