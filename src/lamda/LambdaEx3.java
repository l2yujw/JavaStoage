package lamda;

@FunctionalInterface
interface MyFunctio2 {
	void myMethod();
}

class Outer {
	int val=10;	// Outer.this.val				

	class Inner {
		int val=20;	// this.val

		void method(int i) {  // 	void method(final int i) {
			int val=30; // final int val=30;

			MyFunctio2 f = () -> {
				System.out.println("             i :" + i);
				System.out.println("           val :" + val);
				System.out.println("      this.val :" + ++this.val);
				System.out.println("Outer.this.val :" + ++Outer.this.val);	
			};

			f.myMethod();
		}
	}
}

class LambdaEx3 {
	public static void main(String args[]) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method(100);
	}
}
