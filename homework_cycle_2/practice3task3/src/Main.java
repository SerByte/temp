public class Main {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 50000; i++) {
            String num = Integer.toString(i);
            String strArr[] = num.split("");
            int numArr[] = new int[strArr.length];
            for (int j = 0; j < strArr.length; j++) {
                numArr[j] = Integer.parseInt(strArr[j]);
            }
            for (int k = 0; k < strArr.length; k++) {
                if (numArr[k] == 2) {
                    count += 1;
                }
            }
        }
        System.out.printf("Result is: %s", count);
    }

}
