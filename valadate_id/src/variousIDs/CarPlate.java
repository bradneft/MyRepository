package variousIDs;

public class CarPlate {
	public static void main(String[] args) {
		//I am in PA
		//format is 3leters keystone then 4 numbers
		//I will use dash instead of keystone
		String plate="djb-3896";
			if(plate.matches("[a-z]{3}-[0-9]{4}")) {
				System.out.println(plate+"is valid");
			}else {
				System.out.println(plate+"is invalid");
			}
		String ssn="123-45-6789";
		if(ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")) {
			System.out.println(plate+"is valid");
		}else {
			System.out.println(plate+"is invalid");
		}
		String AreaCode="26506";
		if(AreaCode.matches("[0-9]{5}")) {
			System.out.println(plate+"is valid");
		}else {
			System.out.println(plate+"is invalid");
		}
		String DLno="26506";
		if(DLno.matches("[0-9]{2}-[0-9]{4}-[0-9]{3}")) {
			System.out.println(plate+"is valid");
		}else {
			System.out.println(plate+"is invalid");
			
		}
		
	}
}
