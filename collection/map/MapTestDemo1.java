package collection.map;

import java.util.*;

public class MapTestDemo1 {
    public static void main(String[] args) {

        String s = "abcdefg+=  i";
        Map<Character, Integer> charCountsMap = getCharCounts(s);
        Set<Character> characters = charCountsMap.keySet();

        for (Character next : characters) {
            Integer count = charCountsMap.get(next);
            System.out.println("char:"+next + "-----" + "count:"+count);
        }

    }

    public static Map<Character,Integer> getCharCounts(String s){
        // 所有的字符
        char[] charArray = s.toCharArray();
        // 集合
        HashMap<Character,Integer> hashMap = new HashMap<>();

        for (char c : charArray) {
            if (hashMap.get(c) == null) {
                hashMap.put(c,1);
            }else {
                hashMap.put(c,hashMap.get(c)+1);
            }
        }

        return hashMap;
    }
}
