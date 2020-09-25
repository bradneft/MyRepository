package wrapers_asingment;

public class Problem {
	
	public static void main(String[] args) {
		//Float
		Float f1=10f;
		Float f2=10f;
		Float f3=new Float(10f);
		System.out.println("f1==f2:"+(f1==f2));
		System.out.println("f1==f3:"+(f1==f3));
		System.out.println("f1 = "+f1);
		System.out.println("f2 = "+f2);
		System.out.println("f1.equals(f2) : "+f1.equals(f2));
		System.out.println("f1.equals(f3) : "+f1.equals(f3));
		Float f4=99f;
		System.out.println("f4.compareTo(99) : "+f4.compareTo(99f));
		System.out.println("f4.compareTo(9) : "+f4.compareTo(9f));
		System.out.println("f4.compareTo(999) : "+f4.compareTo(999f));
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		float F=f4;//Autoboxing
		System.out.println("f:"+f4);
		F=10000f;
		f4=F;
		System.out.println("f4:"+f4);
		
		String s="12443";
		
		Float f5=Float.parseFloat(s);  //Common across all the wrappers except Character
		System.out.println("f5 = "+f5);
		
		f5=1919191f;
		s=f5+"";//anything in java can be converted to the String by just doing this
		System.out.println("s : "+s);
		
		Float f6=77f;
		Float f7=f6.floatValue(); //doubleValue() //shortValue() //longValue()
		System.out.println("f7 = "+f7);
		int r=f7.intValue();
		System.out.println("r : "+r);
		
		
		
		
	}

}
