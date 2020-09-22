package arithmetic_ops;

public class ArithmeticOpsDemo {
	public static void main(String[] args) {
		int x=7;
		int y=3;
		System.out.println("x="+x);
		System.out.println("y="+y);
		int add = x+y;
		System.out.println("x+y="+ add);
		int subtract = x-y;
		System.out.println("x-y="+ subtract);
		int multiply = x*y;
		System.out.println("x times y="+ multiply);
		int divide = x/y;
		System.out.println("x devided by y ="+ divide);
		int modulus = x%y;
		System.out.println("remander of x deivided by y ="+ modulus);
		int increment = ++x;
		System.out.println("the increment of x is"+ increment);
		int decrement = --x;
		System.out.println("the decrement of x is"+ decrement);
	}

}
