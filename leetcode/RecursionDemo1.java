package leetcode;

public class RecursionDemo1 {
    public static void main(String[] args) {
        int num = f2(6);
        System.out.println(num);
    }

    public static int f(int num){
        if(num == 1){
            return 1;
        }
        else {
            return num * f(num - 1);
        }
    }

    public static int f2(int num){
        if(num == 1){
            return 1;
        }else {
            return num + f2(num - 1);
        }
    }
}
