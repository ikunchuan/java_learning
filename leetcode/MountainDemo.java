package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MountainDemo {

    public static void main(String[] args) {

    }

    public static List<Integer> findPeaks(int[] mountain) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < mountain.length - 1; i++) {
            if (isMountain(mountain, i)){
                list.add(i);
            }
        }

        return list;
    }

    public static boolean isMountain(int[] mountain, int index){
        if(mountain[index] > mountain[index-1] && mountain[index] > mountain[index+1])
            return true;

        return false;
    }
}
