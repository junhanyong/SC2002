import java.util.Scanner;

public class P3 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Starting: ");
		int start = sc.nextInt();

		System.out.println("Ending: ");
		int end = sc.nextInt();
		if (end <= start) {
			System.out.println("Error!");
			return;
		}
		
		System.out.println("Increment: ");
		int increment = sc.nextInt();
		
		System.out.println("US$ S$");
		System.out.println("-----");
		for (int i = start; i <= end; i += increment) {
			System.out.println(i +" "+((double)i*1.82));
		}	

		int x = start;
		System.out.println("US$ S$");
		System.out.println("-----");
		while (x <= end) {
			System.out.println(x +" "+((double)x*1.82));
			x += increment;
		}

		System.out.println("US$ S$");
		System.out.println("-----");
		do {
			System.out.println(start +" "+((double)start*1.82));
			start += increment;
		} while (start <= end);

	}
}