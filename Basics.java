class Basics {
    public static int avg(int a,int b,int c){
        return (a+b+c)/3; 
    }
    public static boolean isEven(int x){
        return x%2==0;
    }
    public static boolean isPalindrome(int y){
        int rev=0,x=y;
        while(x>0){
            int rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        System.out.println(rev);
        return rev==y;
    }
    public static void main(String[] args) {
        System.out.println(isEven(99));
        System.out.println("Palindrome "+ isPalindrome(121));
        int av=avg(52,6,90);
        System.out.println(av);
        
        System.out.println(Math.max(124,250));
        System.out.println(Math.min(124,250));
        System.out.println(Math.abs(-10.15f));
        System.out.println(Math.pow(5,3));
        System.out.println(Math.sqrt(250));
        int randomNum = (int)(Math.random() * 101);
        System.out.println(randomNum);
        
    }
}
