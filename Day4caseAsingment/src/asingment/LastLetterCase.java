package asingment;

public class LastLetterCase {

	public static void main (String[] args) {
		String s="hello hi how are you ing today";
		String a[]=s.split(" ");
		StringBuilder b=new StringBuilder();
		for (int i=0;i<a.length;i++) {
			b.append(a[i].substring(0,a[i].length()-1)).append(Character.toUpperCase(a[i].charAt(a[i].length()-1))).append(" ");
			
		}
		System.out.println(b.toString().trim());
	}
}
