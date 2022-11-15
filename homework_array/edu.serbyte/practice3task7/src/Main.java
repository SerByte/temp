import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter num: ");
            int num = scan.nextInt();
            nums[i] = num;
        }

        int min = nums[0];
		for (int num : nums) {
			if (num % 2 == 0 && num < min) {
				min = num;
			}
		}

        System.out.printf("Result is: %s", min);
    }
}
