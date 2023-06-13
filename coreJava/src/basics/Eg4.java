package basics;

public class Eg4 {
	//instance varables ,methods
	int i=10;
	int j=20;
	
	public void number() {
		System.out.println(i+j);
	}
	public static void m1() {
		System.out.println("adding");
	}

	public static void main(String[] args) {
		int s=10;
		int r=20;
		System.out.println(s*r);
		Eg4 obj=new Eg4();
		System.out.println(new Eg4().i);
		//System.out.println(new Eg4().j);
		System.out.println(obj.j);
		obj.number();
		m1();
		}
		

	}


