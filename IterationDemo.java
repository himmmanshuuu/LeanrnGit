
public class IterationDemo {
	public static void main(String[] args) {
		// for loop 
		for(int i = 0 ; i < 5 ; i++)
		{
			System.out.println(i);
		}
		
		System.out.println();
		// while loop 
		
		int i = 0; 
		while(i < 5)
		{
			System.out.println(i);
			i++;
		}
		
		// do while loop 
		
		do
		{
			System.out.println(i);
			++i;
		}
		while(i < 10);
		
		// pattern printing 
		for(int k = 1 ; k <= 6 ; k++)
		{
			for(int j = 1; j <= k; j++)
			{
				System.out.print("$");
			}
			System.out.println();
		}
	}
}
