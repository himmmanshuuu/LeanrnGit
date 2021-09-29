class Calci
{
	int num1 ; 
	int num2 ; 
	int res ; 
	
	public void perf()
	{
		res = num1+num2;
	}
}

public class objectDemo {
	public static void main(String[] args) {
		
		Calci obj = new Calci();
		
		obj.num1 = 5; 
		obj.num2 = 7; 
		
		obj.perf();
		
		System.out.println(obj.res);
	}
}
