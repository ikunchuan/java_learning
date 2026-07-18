package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombineDemo77 {
    public static void main(String[] args) {

    }

    //    返回范围 [1, n] 中所有可能的 k 个数的组合
    public List<List<Integer>> combine(int n, int k) {

        // 存放结果
        List<List<Integer>> result = new ArrayList<>();
        // 存放一维数组，到时候村到result里面
        List<Integer> path = new ArrayList<>();

        backtracking(n,k,1,result,path);

        return result;
    }

        // 存放结果
    //    List<List<Integer>> result = new ArrayList<>();
    //    // 存放一维数组，到时候村到result里面
    //    List<Integer> path = new ArrayList<>();

    public void backtracking(int n, int k,int startIndex, List<List<Integer>> result, List<Integer> path){
        if(path.size() == k){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= n; i++) {
            path.add(i);
            backtracking(n,k,i+1,result,path);
            path.remove(path.size()-1);
        }

    }


}
