package homework;

public class Instance {
	int i=10;
	int j=20;
	String username="rajesh";

	public void add() {
		System.out.println(i*j);
	}
	public void username() {
		System.out.println(username);
	}
	

	public static void main(String[] args) {
		
		Instance obj = new Instance();
		obj.add();
		obj.username();
		

}
}