package operatorsJava;

public class logical {

	public static void main(String[] args) {
		//logical operators && (both conditions must satisfy) || (any one conditions must satisfy)
		
		//&&
		System.out.println(true&&true);

		System.out.println(true&&false);

		System.out.println(false&&false);

		System.out.println(false&&true);
		
		//||
		System.out.println(true||true);

		System.out.println(true||false);

		System.out.println(false||false);

		System.out.println(false||true);
		
		
		//Bitwise Exclusive
		System.out.println(true^true);

		System.out.println(true^false);

		System.out.println(false^false);

		System.out.println(false^true);
		

	}

}
