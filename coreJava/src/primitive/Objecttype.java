package primitive;

public class Objecttype {

	public static void main(String[] args) {
	
		//primitive to object 
		//using parameterized cons
		
		int i=10;
		System.out.println("primitive type" + i);
		
		Integer integer = new Integer(i);
		System.out.println("object type" + integer);
		
		
		//value of method
		
		int j =10;
		System.out.println("primitive type" +j);
		Integer valueOf = Integer.valueOf(j);
		System.out.println("object of method"+ j);
		
		//auto boxing
		
		int k=10;
		System.out.println("primitive" +k);
		Integer auto=k;
		System.out.println("object of method"+ auto);
		
	}

}
