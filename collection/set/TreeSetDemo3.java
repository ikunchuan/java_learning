package collection.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class TreeSetDemo3 {

    public static void main(String[] args) {

        MyStringCompare myStringCompare = new MyStringCompare();

        TreeSet treeSet = new TreeSet(myStringCompare);

        treeSet.add("asasbifsbi");
        treeSet.add("bhsbifsbi");
        treeSet.add("hsbifsbii");
        treeSet.add("hsbif");
        treeSet.add("asbif");
        treeSet.add("if");
        treeSet.add("if2");

        Iterator iterator = treeSet.iterator();

        while (iterator.hasNext()){
            Object o = iterator.next();
            String s = (String) o;
            System.out.println(s);
        }

    }
}


class MyStringCompare implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        if(s1.length() == s2.length()){
            return s1.compareTo(s2);
        }
        return s1.length()-s2.length();
    }
}