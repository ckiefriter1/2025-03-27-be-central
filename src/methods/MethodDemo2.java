package methods;

public class MethodDemo2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 20;
		int b = 30;
		
		displayNumbers(a, b);
		
		int result = addNumbers(a, b);
		
		displayNumbers(result, 0);
		
		a = -31;
		b = -56;
				
		displayNumbers(a, b);
		
		
		
	}
	
	public static int addNumbers(int a, int b) {
		return a + b;
	}
	
	public static void displayNumbers(int a, int b) {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("-----------");
		return;
	}
	

}
