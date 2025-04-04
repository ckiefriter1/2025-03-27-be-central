
public class VariableSwap {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		int temp = 0;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}

}
