package leetcode;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumAddDemo1 {


        public static void main (String[] args) throws java.lang.Exception
        {
            // 这里继续添加代码,或者清除模板后自己添加代码
            // 不支持动态输入(Scanner),如有需要,请添加常量代替所需数据.
            System.out.println("Hello World!");
            int[] nums = new int[]{-1,0,1,2,-1,4};
            ArrayList<int[]> list = threeNumToZero(nums);
            for (int[] ints : list) {
                System.out.println(Arrays.toString(ints));
            }

        }

        public static ArrayList<int[]> threeNumToZero(int[] nums){
            //结果数组
            ArrayList<int[]> result = new ArrayList<>();

            // 把正负数据的下标分别加到相应的数组
            ArrayList<Integer> zheng = new ArrayList<>();
            ArrayList<Integer> fu = new ArrayList<>();

            for(int x=0;x<nums.length;x++){
                if(nums[x] >= 0){
                    zheng.add(x);
                }else{
                    fu.add(x);
                }
            }
            // 拿大一点的数组作为待比较数组，小一点的数组拿来相加
            ArrayList<Integer> addNums = new ArrayList<>();
            ArrayList<Integer> comparedNums = new ArrayList<>();

            if(zheng.size() >= fu.size()){
                addNums = fu;
                comparedNums = zheng;
            }else{
                addNums = zheng;
                comparedNums = fu;
            }


            // 对相加数组，进行相加(addNums[下标])，然后判断是否存在这个数的相反数
            for(int i=0;i<addNums.size()-1;i++){
                for(int j=i+1;j<addNums.size();j++){
                    int comparednum = nums[addNums.get(i)]+nums[addNums.get(j)];
                    for(int a=0;a<comparedNums.size();a++){
                        if(comparednum+ comparedNums.get(a) == 0){
                            int[] arr = new int[]{i,j,a};
                            result.add(arr);
                        }
                    }
                }
            }
            return result;

        }


/*这里写解题思路
先把所有的负数、正数的下标分别都用一个数组装起来（如果有0，则放到正数的数组里面），然后数组较小的那一边，把所有的数据加起来，然后
拿到另一边进行比较，如果相加等于0，则返回下标
*/

}
