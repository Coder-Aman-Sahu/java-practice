import java.util.Scanner;

public class M1Program1 {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        } 
        else {
            return n * fact(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("The factorial of " + num + " is " + fact(num));
    }

    
}
