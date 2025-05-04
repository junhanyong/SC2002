import java.util.Scanner;

public class P2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input salary:");
		int salary = sc.nextInt();
		
		System.out.println("Input merit points:");
		int merit = sc.nextInt();
		
		if (salary >= 500 && salary < 600) System.out.println("Grade C");
		else if (salary >= 600 && salary <= 649) {
			if (merit < 10) System.out.println("Grade C");
			else System.out.println("Grade B");
		}
		else if (salary >= 650 && salary < 700) System.out.println("Grade B");
		else if (salary >= 700 && salary <= 799) {
			if (merit < 20) System.out.println("Grade B");
			else System.out.println("Grade A");
		}
		else if (salary <= 899) System.out.println("Grade A");
	}
}