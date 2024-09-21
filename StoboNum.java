import java.util.*;
class StoboNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // change this to calculate for different lengths
        for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
            String str = String.valueOf(i);
            String t = "";
            boolean isStrobogrammatic = true;
            for (int j = str.length() - 1; j >= 0; j--) {
                switch (str.charAt(j)) {
                    case '0':
                        t += '0';
                        break;
                    case '1':
                        t += '1';
                        break;
                    case '8':
                        t += '8';
                        break;
                    case '6':
                        t += '9';
                        break;
                    case '9':
                        t += '6';
                        break;
                    default:
                        isStrobogrammatic = false;
                        break;
                }
            }
            if (isStrobogrammatic && str.equals(t)) {
                System.out.print(str+" ");
            }
        }
    }
}
