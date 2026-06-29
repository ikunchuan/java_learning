package collection.list;

import java.util.*;

public class ListDemo1 {

    public static void main(String[] args) {
        Student student1 = new Student();

        ArrayList al1 = new ArrayList();
        al1.add("java01");
        al1.add("java02");

        al1.add(student1);
        al1.add("java03");


        al1.add(student1);

        System.out.println(al1);
        System.out.println("---------");

        ListIterator listIterator = al1.listIterator();
        while (listIterator.hasNext()){
            Object o = listIterator.next();
            System.out.println(o);
            if(o.equals(student1)){
                System.out.println("wwww");
                listIterator.set("java666");
            }
        }



//        Iterator it = al1.iterator();
//        while (it.hasNext()){
//            Object o = it.next();
//            System.out.println(o);
//
//            if(o.equals(student1)){
//                System.out.println("wwwww");
//                al1.add("javahhhhh");
//            }
//        }

        System.out.println(al1);


    }

}

class Student{

    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}