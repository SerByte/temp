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
        int min = nums[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
            if (min > nums[i]) {
                min = nums[i];
                minIndex = i;
            }
        }

        int result = minIndex + maxIndex;
        System.out.println(String.format("Min Index %s ", minIndex));
        System.out.println(String.format("Max Index %s ", maxIndex));
        System.out.println(String.format("Result is %s", result));
    }
}
