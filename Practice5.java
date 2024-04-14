//Q.Java program to print Fibonacci Series upto n terms.

import java.util.Scanner;
public class Practice5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of fibonacci series: ");
        int n=sc.nextInt();
        int a=0,b=1,c=0;
        int num[]=new int[n];
        num[0]=0;
        num[1]=1;
        for(int i=2;i<n;i++){
            num[i]=num[i-1]+num[i-2];
        }
        System.out.println("Fibonacci Series: ");
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        
    
        for(int i=0;i<n;i++){
        System.out.println(i);
        }
        System.out.println("The Fibonacci Series is: ");
        while(n>0){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
            n=n-1;
        }
    }
}
