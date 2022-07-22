import java.util.Scanner;

public class code6 {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int i, j, k;
		
		System.out.print("Enter Diamond Number Pattern Rows = ");
		int rows = sc.nextInt();
		
		System.out.println("Printing Diamond Number Pattern");
		
		for (i = 1 ; i <= rows; i++ ) 
		{
			for (j = 1 ; j <= rows - i; j++ ) 
			{
				System.out.print(" ");	
			}
			for (k = 1 ; k <= i * 2 - 1; k++ ) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (i = rows - 1 ; i > 0; i-- ) 
		{
			for (j = 1 ; j <= rows - i; j++ ) 
			{
				System.out.print(" ");
			}
			for (k = 1 ; k <= i * 2 - 1; k++ ) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
