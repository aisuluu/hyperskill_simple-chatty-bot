import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int students = in.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < students; i++) {
            int grade = in.nextInt();
            if (grade == 5) {
                a = a + 1;
            } else if (grade == 4) {
                b = b + 1;
            } else if (grade == 3) {
                c = c + 1;
            } else if (grade == 2) {
                d = d + 1;
            }
        }
        System.out.print(Integer.toString(d) + ' ' + Integer.toString(c) +
                ' ' + Integer.toString(b) + ' ' + Integer.toString(a));
    }
}