package basics;

import homework.Eg5;

public class Eg5 {

	public static void main(String[] args) {
		Eg5 customer1 =new Eg5();
		customer1.user("rajesh",6300847403l,"ap");
		details(518216l,"veldurthi");
		System.out.println("-----------------------");
		Eg5 customer2=new Eg5();
		customer2.user("rakesh", 9966473596l, "ap");
		details(518216l,"veldurthi");
		
		System.out.println("-----------------------");
		Eg5 customer3 =new Eg5();
		customer3.user("Ganesh", 8985942709l, "ap");
		details(518216l,"veldurthi");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public void user(String customername,long number,String location) {
		System.out.println("customername "+customername);
		System.out.println("customercontact :"+number);
		System.out.println("customeraddress :"+location);
	}
	
	
	
	public static void details(long bankpincode,String branch) {
		
		System.out.println("bankpincode :"+ bankpincode);
		System.out.println("bankbranchlocation :"+branch);
	}
}
