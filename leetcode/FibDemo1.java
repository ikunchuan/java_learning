package leetcode;

public class FibDemo1 {

    public static void main(String[] args) {
        int fib = fib(2);
        System.out.println(fib);
    }

    public static int fib(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        int result = 0;
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-2] + dp[i-1];
            result = dp[i];
        }
        return result;
    }
}
