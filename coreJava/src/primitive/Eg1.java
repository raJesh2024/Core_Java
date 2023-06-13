package primitive;

public class Eg1 {

	public static void main(String[] args) {
		//primitive to object
		int i=10;
		System.out.println("primitive type:"+i);

	
	//parameterized operator
	Integer integer=new Integer(i);
	System.out.println("objective type:" +i);
	
	//value of
	Integer valueof= Integer.valueOf(i);
	System.out.println("objective type:" +i );
	
	//auto boxing
	
	Integer ii=i;
	System.out.println("objective type:" +i);
	}
	
	
	


}