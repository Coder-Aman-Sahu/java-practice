//Program to find sum of all digits.    Ex- 425 , O/p - 11

import java.util.scanner
public class practice-1{
    public static void main(Stiring args[]){
        int num,rem=0,sum=0,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println('Ener the number: ');
        num=sc.nextInt();
        temp=num;
        while(num>0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum of Digits of "+temp+"is: "+sum);
        }
        }