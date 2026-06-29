package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class IntersectionOfTwoArrays349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arrayList = new ArrayList();

        HashSet<Integer> hashSet1 = new HashSet<>();
        for (Integer i : nums1) {
            hashSet1.add(i);
        }
        HashSet<Integer> hashSet2 = new HashSet<>();
        for (Integer j : nums2) {
            hashSet2.add(j);
        }

        hashSet1.retainAll(hashSet2);

        int[] arr = hashSet1.stream().mapToInt(Integer::intValue).toArray();

        return arr;
    }
}
