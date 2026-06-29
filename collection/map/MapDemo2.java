package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("01","zhangSan1");
        map.put("02","zhangSan2");
        map.put("03","zhangSan3");

        // 先获取map集合的所有键的集合set
        Set<String> strings = map.keySet();

        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            // 有了key就可以用get方法来获取value
            String value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }

}
