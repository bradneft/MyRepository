package wrapers_asingment;

public class Doubleproblem {

	public static void main(String[] args) {
		//Double
		Double d1=10d;
		Double d2=10d;
		Double d3=new Double(10d);
		System.out.println("d1==d2:"+(d1==d2));
		System.out.println("d1==d3:"+(d1==d3));
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		System.out.println("d1.equals(d2) : "+d1.equals(d2));
		System.out.println("d1.equals(d3) : "+d1.equals(d3));
		Double d4=99d;
		System.out.println("d4.compareTo(99) : "+d4.compareTo(99d));
		System.out.println("l4.compareTo(9) : "+d4.compareTo(9d));
		System.out.println("l4.compareTo(999) : "+d4.compareTo(999d));
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		Double D=d4;//Autoboxing
		System.out.println("D:"+d4);
		D=10000D;
		d4=D;
		System.out.println("d4:"+d4);
		
		String s="12443";
		
		Double d5=Double.parseDouble(s);  //Common across all the wrappers except Character
		System.out.println("d5 = "+d5);
		
		d5=1919191d;
		s=d5+"";//anything in java can be converted to the String by just doing this
		System.out.println("s : "+s);
		
		Double d6=77d;
		Float f7=d6.floatValue(); //doubleValue() //shortValue() //longValue()
		System.out.println("l7 = "+f7);
		int r=f7.intValue();
		System.out.println("r : "+r);
		
	}
}
