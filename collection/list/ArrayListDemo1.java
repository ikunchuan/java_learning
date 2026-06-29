package collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo1 {

    public static void main(String[] args) {



        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("java01");
        arrayList1.add("java02");
        arrayList1.add("java01");
        arrayList1.add(new Integer(1));
        arrayList1.add(new Integer(3));
        arrayList1.add(new Integer(1));
        arrayList1.add(5);
        arrayList1.add(6);
        arrayList1.add(7);
        arrayList1.add(6);
        arrayList1.add(1);

        // arraylist可以通过get来获取制定索引的元素
        Object o1 = arrayList1.get(0);
        System.out.println(o1 + o1.getClass().getName());

        ArrayList listResult = removeSameElement(arrayList1);

        for (Object o : listResult) {
            System.out.println(o);
        }

    }

    public static ArrayList removeSameElement(ArrayList arrayList){
        ArrayList container = new ArrayList();

        ListIterator listIterator = arrayList.listIterator();

        while (listIterator.hasNext()){

            // arrayList
            Object o = listIterator.next();

            // 在容器中，取出每一个元素和现在迭代器中的元素比较，如果有，就删除迭代器中的元素，如果没有，把元素添加到container
            if (container.contains(o)){
                continue;
            }else {
                container.add(o);
            }



        }
        return container;
    }

}
