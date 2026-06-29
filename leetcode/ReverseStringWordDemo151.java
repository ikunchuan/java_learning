package leetcode;

public class ReverseStringWordDemo151 {
    public static void main(String[] args) {

        String s = "word   is  hh u  hello";
        ReverseStringWordDemo151 reverseStringWordDemo151 = new ReverseStringWordDemo151();
        String string = reverseStringWordDemo151.reverseWords(s);

        System.out.println(string);

    }

    public String reverseWords(String s) {

        s = s+' ';
        String result = "";

        int i = 0,j = 0;
        while(j <= s.length() - 1){
            while (s.charAt(i) == ' ' && i < s.length() - 1)
                i++;
            j = i;
            while (s.charAt(j) != ' ' && j < s.length() - 1)
                j++;

            if (i == j) break;
            result = s.substring(i,j) + ' ' + result;
            i = j;
        }

        return result.substring(0,result.length()-1);
    }
}
