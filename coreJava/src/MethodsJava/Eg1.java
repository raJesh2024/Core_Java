package MethodsJava;

public class Eg1 {

	//instance method
	public static void main(String[] args) {
		Eg1 eg1=new Eg1();
		eg1.add();
		eg1.update();
		
		new Eg1().add();
		new Eg1().update();

	}
	//instance method
	public void add() {
		System.out.println("add method");
	}
	
	//instance method
	public void update() {
		System.out.println("update method");
	}

}
