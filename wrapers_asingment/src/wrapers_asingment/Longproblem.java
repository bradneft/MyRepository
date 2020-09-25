package wrapers_asingment;

public class Longproblem {

	public static void main(String[] args) {
		//Long
		Long l1=10L;
		Long l2=10L;
		Long l3=new Long(10L);
		System.out.println("l1==l2:"+(l1==l2));
		System.out.println("l1==l3:"+(l1==l3));
		System.out.println("l1 = "+l1);
		System.out.println("l2 = "+l2);
		System.out.println("l1.equals(l2) : "+l1.equals(l2));
		System.out.println("l1.equals(l3) : "+l1.equals(l3));
		Long l4=99L;
		System.out.println("l4.compareTo(99) : "+l4.compareTo(99l));
		System.out.println("l4.compareTo(9) : "+l4.compareTo(9l));
		System.out.println("l4.compareTo(999) : "+l4.compareTo(999l));
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		Long L=l4;//Autoboxing
		System.out.println("L:"+l4);
		L=10000L;
		l4=L;
		System.out.println("l4:"+l4);
		
		String s="12443";
		
		long l5=Long.parseLong(s);  //Common across all the wrappers except Character
		System.out.println("f5 = "+l5);
		
		l5=1919191l;
		s=l5+"";//anything in java can be converted to the String by just doing this
		System.out.println("s : "+s);
		
		Long l6=77L;
		Float f7=l6.floatValue(); //doubleValue() //shortValue() //longValue()
		System.out.println("l7 = "+f7);
		int r=f7.intValue();
		System.out.println("r : "+r);
		
		
		
		
	}

}
