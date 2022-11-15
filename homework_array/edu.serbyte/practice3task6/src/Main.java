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
        int max = 0;
        for (int num : nums) {
            if (max < num) {
                max = num;
            }
        }
        System.out.printf("Result is: %s", max);
    }
}
