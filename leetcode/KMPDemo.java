package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KMPDemo {
    public static void main(String[] args) {

        String s = "ababcdababecababcdabab";
        int[] next = getNext(s);
        System.out.println(Arrays.toString(next));

    }

    static int[] getNext(String s){

        if (s.isEmpty()) return new int[]{};
        if (s.length() == 1) return new int[]{-1};
        if (s.length() == 2) return new int[]{-1,0};

        int[] next = new int[s.length()];
        next[0] = -1;
        next[1] = 0;
        if (s.charAt(0) == s.charAt(1)){
            next[2] = 1;
        }else {
            next[2] = 0;
        }

        for (int i = 2; i < s.length()-1; i++) {
            if(s.charAt(i) == s.charAt(next[i])){
                next[i+1] = next[i]+1;
            }else {
                int j = i - 1;
                while (next[j] != 0){
                    j = next[j];
                    if(s.charAt(next[j]) == s.charAt(i)) {
                        next[i+1] = next[j+1] + 1;
                        break;
                    }
                }
            }
        }

        return next;

    }
}
