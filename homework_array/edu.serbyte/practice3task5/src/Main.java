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
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (current == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 0) {
                        break;
                    }
                    sum = sum + current;
                }
                break;
            }
        }
        System.out.printf("Result is: %s", sum);
    }
}
