import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        for (int i = 0; i <= 1000; i++) {
            int result1 = a * (i * i * i) + b * (i * i) + c * i + d;
            if (result1 == 0) {
                System.out.println(i);
            }
        }
    }
}