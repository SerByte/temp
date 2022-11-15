import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num: ");
		String num = scan.nextLine();
	    String strArr[] = num.split("");
	     int numArr[] = new int[strArr.length];
	        for (int i = 0; i < strArr.length; i++) {
	            numArr[i] = Integer.parseInt(strArr[i]);
	        }
        int max = 0;
		for (int j : numArr) {
			if (max < j) {
				max = j;
			}
		}
        System.out.printf("Max: %s", max);
	}

}
