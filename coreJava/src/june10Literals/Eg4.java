package june10Literals;

public class Eg4 {
	//instance v/static v
	String Name="Rajesh";
	String Id="15991";
	static String Clg="veltech";
	static String address="Morai";

	public static void main(String[] args) {
		/*System.out.println("Main:" + new Eg4().Name);
		System.out.println("Main:" + new Eg4().Id);
		System.out.println("Main :"+Clg);
		System.out.println("Main:"+ address);
*/
	
	
	System.out.println("-------------------------");
	 new Eg4().user();
	
	System.out.println("---------------------------");
	Eg4.user1();
	}
	
	
	
	
	
	//InstanceMethod
	public void user() {
		System.out.println("Instancemethod:"+Name);
		System.out.println("Instancemethod:"+Id);
		System.out.println("StaticMethod:"+ Clg);
		System.out.println("staticMethod:"+ address);
		
	}
	
	//StaticMethod
	public static void user1() {
		System.out.println("Instancemethod:"+new Eg4().Name);
		System.out.println("Instancemethod:"+new Eg4().Id);
		System.out.println("Staticmethod :"+Clg);
		System.out.println("staticmethod :"+address);
		
		

	
	
	

}
}