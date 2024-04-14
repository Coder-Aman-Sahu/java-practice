//Q.Given the principal,rate and time and using program we have to find compound interest.
//A=P(1+r/n)^nt
//CI=A-P

import java.util.Scanner;
import java.lang.Math;
public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount:");
        double principal = scanner.nextDouble();

        System.out.println("Enter the annual interest rate (in decimal form):");
        double rate = scanner.nextDouble();

        System.out.println("Enter the number of times interest is compounded per year:");
        int numTimesCompounded = scanner.nextInt();

        System.out.println("Enter the number of years the money is invested for:");
        int years = scanner.nextInt();

        double amount = principal * Math.pow(1 + rate / numTimesCompounded, numTimesCompounded * years);
        double compoundInterest = amount - principal;

        System.out.printf("The compound interest is %.2f\n", compoundInterest);
       
    }
}
