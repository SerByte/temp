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

        for (int num : nums) {
            System.out.printf("Похiдна з числа %s = 0 \n", num);
        }
    }
}
