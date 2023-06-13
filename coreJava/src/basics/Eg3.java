package basics;

public class Eg3{
	
	public static void main (String[]args) {
		int i=10;
		int j=20;
		System.out.println(i+j);
		update();
		Eg3 obj =new Eg3();
		obj.add();
		System.out.println(obj.m);
		System.out.println(new Eg3().k);
		
		
		
		
	}
	int m=50;
	int k= 90;
	public void add() {
		System.out.println(m*k);
	}
	public static void update() {
		System.out.println("printing");
	}
}