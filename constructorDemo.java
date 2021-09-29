class Calc
{
	int num1 ; 
	int num2; 
	
	public Calc()
	{
		num1 = 5 ; 
		num2 = 7; 
	}
	
	public Calc(int n)
	{
		num1 = n;
		num2 = n;
	}
	
}
public class constructorDemo {
	public static void main(String[] args) {
		Calc obj = new Calc();
		Calc obj2 = new Calc(7);
		
		
		System.out.println(obj.num1);
		System.out.println(obj2.num1);
	}
}

