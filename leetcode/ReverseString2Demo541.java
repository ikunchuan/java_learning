package leetcode;

public class ReverseString2Demo541 {
    public static void main(String[] args) {

    }

    public String reverseStr(String s, int k) {

        for (int i = 0; i < s.length(); i+=2*k) {

        }

        if (s.length() < k){
            reverseString(s);
        } else if (s.length() > k && s.length() < 2*k) {

        }

        return null;
    }

    void reverseString(String s) {
        int length = s.length();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0,j = length-1; i < length/2; i++, j--) {
            char temp;
            temp = sb.charAt(i);
            sb.setCharAt(i,s.charAt(j));
            sb.setCharAt(j,temp);
        }
    }
}
