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

        int index = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max && nums[i] % 2 != 0) {
                max = nums[i];
                index = i;
            }
        }
        System.out.println(nums[index]);
    }

}
