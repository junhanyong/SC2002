import java.util.Scanner;

public class P4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int height = sc.nextInt();
		if (height < 1) {
			System.out.println("Error!");
			return;
		}
		
		for (int i = 0; i < height; i++) {
			int x = i;
			for (int j = 0; j <= i; j++) {
				if (x%2 == 0) System.out.print("AA");
				else System.out.print("BB");
				x++;
			}
			System.out.println();
		}
	}
}