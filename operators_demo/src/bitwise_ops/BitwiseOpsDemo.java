package bitwise_ops;

public class BitwiseOpsDemo {
	public static void main(String[] args) {
		int x=7;
		int y=3;
		System.out.println("x = "+x+" and y = "+y);
		double myand = x&y;
		System.out.println("x and y is "+myand);
		double myor = x|y;
		System.out.println("the or of x and y is "+myor);
		double mynot = ~x;
		System.out.println("not 5 = "+mynot);
		double myxor = x^y;
		System.out.println("x xor y is "+myxor);
		double zfls = x<<y;
		System.out.println("x zero fill left shift y = "+zfls);
		double srs = x>>y;
		System.out.println("x signed right shift y is "+srs);
		double zfrs = x>>>y;
		System.out.println("x zero fill right shift is "+ zfrs);
	}
}
