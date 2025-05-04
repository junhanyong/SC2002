import java.util.Scanner;
import java.lang.Math;

public class Lab2p1 {

	public static void main(String[] args){
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Perform the following methods:");
			System.out.println("1: multiplication test");
			System.out.println("2: quotient using division by subtraction");
			System.out.println("3: remainder using division by subtraction");
			System.out.println("4: count the number of digits");
			System.out.println("5: position of a digit");
			System.out.println("6: extract all odd digits");
			System.out.println("7: quit");
			choice = sc.nextInt();
			switch (choice) {
				case 1: /* add mulTest() call */
					mulTest();
					break;
					
				case 2: /* add divide() call */
					int m = sc.nextInt();
					int n = sc.nextInt();
					System.out.println(divide(m,n));
					
					break;
					
				case 3: /* add modulus() call */
					int x = sc.nextInt();
					int y = sc.nextInt();
					System.out.println(modulus(x,y));					
					
					break;
					
				case 4: /* add countDigits() call */
					int z = sc.nextInt();
					int a = countDigits(z);	
					if (a == 0) System.out.println("Error input!!");
					else System.out.println(a);
					
					break;
					
				case 5: /* add position() call */
					n = sc.nextInt();
					int digit = sc.nextInt();
					
					x = position(n,digit);
					
					System.out.println(x);
					
					break;
					
				case 6: /* add extractOddDigits() call */
					long number = sc.nextLong();
					if (number < 0) System.out.println("Error input!!");
					else System.out.println(extractOddDigits(number));
					
					
					
					break;
					
				
				case 7: System.out.println("Program terminating ….");
			}
		} while (choice < 7);
	}
	
	/* add method code here */
	public static void mulTest(){
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		for (int i = 0; i < 5; i++) {
			int x = (int)(Math.random() * 10)+1;
			int y = (int)(Math.random() * 10)+1;
			
			System.out.println("How much is "+ x + " times " + y + "?");
			int z = sc.nextInt();
			if (z == x * y) counter++;	
		}
		System.out.println(counter + " answers out of 5 are correct.");
	}
	
	public static int divide (int m, int n) {
		int quotient = 0;
		
		while (m-n >= 0) {
			m = m - n;
			quotient++;
		}
		return quotient;
	}
	
	public static int modulus(int m, int n) {
		return m % n;
	}
	
	public static int countDigits(int n) {
		if (n <= 0) return 0;
		int x = 0;
		
		while (n > 0) {
			n /= 10;
			x++;
		}
		return x;	
	}
	
	public static int position(int n, int digit) {
		int counter = 1;
		while (n > 0) {
			int x = n % 10;
			if (x == digit) return counter;
			else {
				n /= 10;
				counter++;
			}	
		}
		return -1; 
	}
	
	public static long extractOddDigits(long n) {
		long odd = 0;
		int multi = 1;
		
		while (n > 0) {
			if ((n % 10) % 2 != 0) {
				odd += multi * (n % 10);
				multi *= 10;
			}
			
			n /= 10;
		}
		
		if (odd == 0) return -1;
		else return odd;
	}
}