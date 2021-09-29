
public class selectionDemo {
	public static void main(String[] args) {
		
		int n = 7 ; 
		
		// if else 
		if(n%2 == 0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}
		
		// ternary operator 
		int i = 7;
		
		int j = i>6?1:2; 
		
		System.out.println(j);
		
		// switch statement 
		
		int x = 4 ; 
		switch(x)
		{
		case 1:
			System.out.println("One");
			break;
		case 2:	
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		}
	}
}
