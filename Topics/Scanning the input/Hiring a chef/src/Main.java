import java.util.Scanner;
//put imports you need here

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        String firstName = in.next();
        int age = in.nextInt();
        String education = in.next();
        int expYears = in.nextInt();
        String cuisine = in.next();
        System.out.println("The form for " + firstName +
                " is completed. We will contact you if we " +
                "need a chef that cooks " + cuisine +
                " dishes.");
    }
}