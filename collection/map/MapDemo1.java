package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("01","zhangSan1");
        map.put("02","zhangSan2");
        map.put("03","zhangSan3");

        System.out.println(map.containsKey("01"));
        System.out.println(map.containsValue("zhangSan1"));
    }

}
