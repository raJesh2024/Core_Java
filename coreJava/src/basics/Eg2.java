package basics;

public class Eg2 {
	//instance varable
	
	int i=10;
	int j=20;
	//instance method
	
	public void add() {
		System.out.println(i+j);
	}

	public static void main(String[] args) {
		Eg2 eg2=new Eg2();
		System.out.println( new Eg2().i);
		System.out.println(eg2.j);
		
		//eg2.add();
		new Eg2().add();
		

	}

}
