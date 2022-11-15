import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter num: ");
            int num = scan.nextInt();
            nums[i] = num;
        }
        int sum = 0;
        for (int num : nums) {
            if (num < 0) {
                sum += num;
            }
        }
        System.out.printf("Result is: %s", sum);
    }
}
