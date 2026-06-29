package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo3 {

    public static void main(String[] args) {
//        ArrayList<String> a1 = new ArrayList<>();
//        a1.add("abc1");
//        a1.add("abc2");
//        a1.add("abc3");
//
//        ArrayList<Integer> a2  =new ArrayList<>();
//        a2.add(4);
//        a2.add(8);
//        a2.add(9);

        ArrayList<PersonGen2> gen2ArrayList = new ArrayList<>();
        gen2ArrayList.add(new PersonGen2("abc1"));
        gen2ArrayList.add(new PersonGen2("abc2"));
        gen2ArrayList.add(new PersonGen2("abc3"));

        ArrayList<StudentGen2> studentGen2ArrayList = new ArrayList<>();
        studentGen2ArrayList.add(new StudentGen2("abc1---"));
        studentGen2ArrayList.add(new StudentGen2("abc2---"));
        studentGen2ArrayList.add(new StudentGen2("abc3---"));

        printColl(gen2ArrayList);
        printColl(studentGen2ArrayList);

    }

//    public static void printColl(ArrayList<?> a1) {
//        Iterator<?> it = a1.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//    }

    public static void printColl(ArrayList<? extends PersonGen2> personGen2){       // 泛型限定
        for (PersonGen2 gen2 : personGen2) {
            System.out.println(gen2.getName());
        }
    }

}

class PersonGen2{
    private String name;

    public PersonGen2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class StudentGen2 extends PersonGen2 {
    public StudentGen2(String name) {
        super(name);
    }
}