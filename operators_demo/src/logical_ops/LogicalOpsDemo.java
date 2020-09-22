package logical_ops;

public class LogicalOpsDemo {
	public static void main(String[] args) {
		int x = 5;
		boolean logical_and = x>1 && x<10 ; //will be true if x is between 1 and 10
		System.out.println(logical_and);
		boolean logical_or = x<2 || x>4; //will be true unless x is 3
		System.out.println(logical_or);
		boolean logical_not = !(x>1 && x<10); // will be true as long as x is not between 1 and 10
		System.out.println(logical_not);
	}

}
