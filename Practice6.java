//Fahrenheit to Celsius degree
import java.util.Scanner;


public class Practice6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Faherenheit temperature: ");
        float f=sc.nextFloat();
        float c=(f-32)*5/9;
        System.out.println("The temperature in Celsius is: "+c);    
        System.out.print("Input a value for inch: ");
        double inch = sc.nextDouble();
        double meters = (inch * 0.0254);
        System.out.println(inch + " inch is " + meters + " meters");  
    }
}
