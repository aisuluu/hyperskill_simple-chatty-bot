import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for(int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz"); }
            else if (i % 5 == 0) {
                System.out.println("Buzz"); }
            else if (i % 3 == 0) {
                System.out.println("Fizz"); }
            else {
                System.out.println(i); }
        }
    }
}