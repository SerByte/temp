import java.util.Scanner;


public class Main {

	private static int calc(int a, int b) {
		return a*b;
	}

	public static void main(String[] args) {
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("Enter first num: ");
			int a = scan.nextInt();
			System.out.print("Enter second num: ");
			int b = scan.nextInt();
			System.out.printf("Result: %s \n", calc(a, b));

			System.out.println("Next or Stop \n 1- Next \n 2- Stop");
			choice = scan.nextInt();
		} while (choice == 1);
	}
}
