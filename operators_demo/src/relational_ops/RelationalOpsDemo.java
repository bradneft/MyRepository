package relational_ops;

public class RelationalOpsDemo {
	public static void main(String[] args) {
		int x =1;
		int y =4;
		System.out.println("x = "+x+" and y = "+y+" . the next 6 true or false boolian values will do the following comparisons. x=y,x does not = y, x is >y,x<y,x >=y,x<=y.");
		boolean a = x==y;
		System.out.println(a);
		boolean b = x!=y;
		System.out.println(b);
		boolean c = x>y;
		System.out.println(c);
		boolean d = x<y;
		System.out.println(d);
		boolean e = x>=y;
		System.out.println(e);
		boolean f = x<=y;
		System.out.println(f);
	}
	
}