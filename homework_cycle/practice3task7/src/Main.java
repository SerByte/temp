import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num: ");
		String tnum = scan.nextLine();
		String strArr[] = tnum.split("");
		ArrayList<String> num = new ArrayList<String>();
		int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }

		for(int i = 0; i< numArr.length; i++) {
			if (numArr[i] == 3 || numArr[i] == 8) {
				continue;
			}
			num.add(strArr[i]);
		}
		System.out.println(num);
	}

}
