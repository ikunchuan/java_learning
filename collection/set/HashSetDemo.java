package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("java01");
        hashSet.add("java02");
        hashSet.add("java03");

        Iterator iterator = hashSet.iterator();

        while (iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(o);
        }
    }
}

class Demo{

}