import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        int num, rem = 0, sum = 0, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        temp = num;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("Sum of Digits of " + temp + " is: " + sum);
    }
}
