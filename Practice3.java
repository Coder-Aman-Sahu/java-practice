//Find the largest number
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float Num1=sc.nextFloat();
        System.out.println("Enter the second number: ");
        float Num2=sc.nextFloat();
        System.out.println("Enter the third number: ");
        float Num3=sc.nextFloat();
        if(Num1>Num2 & Num1>Num3){
            System.out.println("The largest number is: "+Num1);
        }
        else if(Num2>Num1 & Num2>Num3){
            System.out.println("The largest number is: "+Num2);
        }
        else{
            System.out.println("The largest number is: "+Num3);}
    }
    
}
