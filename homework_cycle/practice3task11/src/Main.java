public class Main {

    public static void main(String[] args) {
        for (int arm = 100; arm <= 999; arm++) {
            for (int i = 1; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        if ((i * i * i) + (j * j * j) + (k * k * k) == arm) {
                            System.out.println(i + "" + j + "" + k);
                        }
                    }
                }
            }
        }
    }
}
