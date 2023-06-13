package homework;
//instance varables
public class Static {
	String usernames="rakesh";
	String Id="15991";
	int i =2023;
	
	
	//instance method
	
	void print() {
		System.out.println("printing...");
		
	}
	public void add() {
		System.out.println(usernames);
	}
	//static method
	public static void put() {

		System.out.println("Put Method");
	}

	public static void main(String[] args) {
		Static obj =new Static();
		/*System.out.println(new Static().usernames);*/
		System.out.println(obj.usernames);
		
		obj.print();
		obj.add();
		put();
			
		}

	
	

}
