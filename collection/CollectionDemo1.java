package collection;

import java.util.ArrayList;

public class CollectionDemo1 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("java01");
        al.add("java02");
        al.add("java03");

        System.out.println(al.size());

        al.remove(0);

        boolean java02 = al.contains("java02");
        System.out.println(java02);

        System.out.println(al);

    }

}
