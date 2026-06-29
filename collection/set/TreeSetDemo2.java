package collection.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 元素自身不具备比较性，或者具备的比较性不是所需要的
 */

public class TreeSetDemo2 {

    public static void main(String[] args) {
        MyCompare myCompare = new MyCompare();
        TreeSet ts = new TreeSet(myCompare);
        ts.add(new Student("lisi01",10));
        ts.add(new Student("lisi02",11));
        ts.add(new Student("lisi02",13));
        ts.add(new Student("lisi02",9));
        ts.add(new Student("lisi03",12));
        ts.add(new Student("lisi04",13));
        ts.add(new Student("lisi04",13));


        for (Object t : ts) {
            Student student = (Student) t;
            System.out.println(student.getName() + "..." + student.getAge());
        }
    }
}

class Student implements Comparable{

    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        if(!(o instanceof Student))
            throw new RuntimeException("no Student");
        Student s = (Student) o;
        if (this.age > s.age)
            return 1;
        if (this.age == s.age){
            return this.name.compareTo(s.name);
        }

        return -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}


// 通过名字来比较
class MyCompare implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Student st1 = (Student)o1;
        Student st2 = (Student)o2;

        if(st1.getName().compareTo(st2.getName()) == 0){
            return st1.getAge().compareTo(st2.getAge());
        }


        return st1.getName().compareTo(st2.getName());
    }
}
