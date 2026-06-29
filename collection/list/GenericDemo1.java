package collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class GenericDemo1 {
    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<String>();
//        ArrayList<String> a1 = new ArrayList<>();
        a1.add("1");
        a1.add("245");
        a1.add("seg");
        a1.add("242dd5");

        ListIterator<String> listIterator = a1.listIterator();
        while (listIterator.hasNext()){
            Object o = listIterator.next();
            System.out.println(o);

        }
    }
}
