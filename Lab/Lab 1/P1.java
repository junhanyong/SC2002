import java.util.Scanner;

public class P1
{
	public static void main(String[] args)
	{
		System.out.println("Input char:");
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		
		switch(a) {
			case 'A':
			case 'a':
				System.out.println("Action movie fan\n");
				break;
			case 'C':
			case 'c':
				System.out.println("Comedy movie fan\n");
				break;
			case 'D':
			case 'd':
				System.out.println("Drama movie fan\n");
				break;
			default:
				System.out.println("Invalid choice\n");
		}
		
	}
}