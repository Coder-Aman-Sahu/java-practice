import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        scan.close();
        
        // Write your code here.
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }
        
        String[] tokens = s.split("[ !,?._'@]+");
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
        
    }
}
