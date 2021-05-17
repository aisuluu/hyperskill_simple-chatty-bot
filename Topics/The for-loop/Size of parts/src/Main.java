import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int partCount = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 0; i < partCount; i++) {
            int detPrint = scanner.nextInt();
            if (detPrint == 1) {
                larger++;
            }
            if (detPrint == -1) {
                smaller++;
            }
            if (detPrint == 0) {
                perfect++;
            }
        }
        System.out.print(perfect + " ");
        System.out.print(larger + " ");
        System.out.print(smaller);
    }
}