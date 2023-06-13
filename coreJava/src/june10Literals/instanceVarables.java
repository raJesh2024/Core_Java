package june10Literals;

public class instanceVarables {
	//InstanceMethod
	public void add() {
	System.out.println("addMethod");
	}
	
	//Instance Method
	public void update() {
		System.out.println("updatemethod");
	}
		//static method
		public static void Eg5() {
			System.out.println("runEg5");
			
		}
		//static method
		public static void Raj() {
			System.out.println("runRaj");
		}
		

	public static void main(String[] args) {
		instanceVarables eg1=new instanceVarables();
		eg1.add();
		eg1.update();
		
		instanceVarables eg2=new instanceVarables();
		eg2.add();
		eg2.update();
		
		instanceVarables.Eg5();
		instanceVarables.Raj();
		
		new instanceVarables().add();
		new instanceVarables().update();
		
		Eg5();
		Raj();
		

		
			}
			
		}
		
		
		
		
		


	