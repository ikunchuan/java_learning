package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("01","zhangSan1");
        map.put("02","zhangSan2");
        map.put("03","zhangSan3");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        Iterator<Map.Entry<String, String>> iterator = entries.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, String> me = iterator.next();     // 返回的是一个Map.Entry对象
            String key = me.getKey();
            String value = me.getValue();
        }

    }
}
