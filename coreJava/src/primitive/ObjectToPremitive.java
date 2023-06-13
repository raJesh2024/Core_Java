package primitive;

public class ObjectToPremitive {
	public static void main (String[] args) {
		
		//object to primitive
		
		int i=10;
		System.out.println("primitive type");
		
		Integer ii=20;
		System.out.println("object type");
		
		//object type to primitive type
		//long Value()
		Long rajeshContactNo =6300847403L;
		Long contactNo=new Long(rajeshContactNo);
		System.out.println("object type" + contactNo);
		long longValue = contactNo.longValue();
		System.out.println();
		
	}

}
