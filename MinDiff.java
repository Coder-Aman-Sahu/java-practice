import java.util.*;
class MinDiff {
    public int solution(String S="29162", String T="10524") {
        // Implement your solution here
        int min = Math.abs(Integer.parseInt(S) - Integer.parseInt(T));
        char[] sArr = S.toCharArray();
        char[] tArr = T.toCharArray();
        int swap = 0;
        int dmin = 9;
        int min2 = min + 1;
        while (min2 > min) {
            for (int i = 0; i < sArr.length; i++) {
                for (int j = 0; j < sArr.length; j++) {
                    int diff = Integer.parseInt(String.valueOf(sArr[j])) - Integer.parseInt(String.valueOf(tArr[j]));
                    if (diff < dmin && diff > 0) {
                    char temp = tArr[j];
                    tArr[j] = tArr[i];
                    tArr[i] = temp;
                    swap++;
                    }
                    if (diff < 0) {
                    char temp = sArr[j];
                    sArr[j] = sArr[i];
                    sArr[i] = temp;
                    swap++;
                    }
                }
            }
            min2 = Math.abs(Integer.parseInt(String.valueOf(sArr)) - Integer.parseInt(String.valueOf(tArr)));
        }
        return swap;
    }
}