package collection.map;

import java.util.*;

public class TreeMapDemo1 {

    public static void main(String[] args) {

        TreeMap<Student,String> treeMap = new TreeMap<>(new MyStudentCompare());
        treeMap.put(new Student(12,"u"),"Wuhan");
        treeMap.put(new Student(11,"b"),"Wuhan");
        treeMap.put(new Student(10,"a"),"Wuhan");
        treeMap.put(new Student(15,"c"),"Wuhan");
        treeMap.put(new Student(12,"c"),"Wuhan");


        Set<Map.Entry<Student, String>> entries = treeMap.entrySet();

        Iterator<Map.Entry<Student, String>> iterator = entries.iterator();

        while (iterator.hasNext()){
            Map.Entry<Student, String> next = iterator.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());
        }

    }

}


class Student implements Comparable<Student>{
    private Integer age;
    private String name;

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    // 姓名和年龄都相等，认为是同一个对象
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(age, student.age) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

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

    // 根据年龄来比较
    @Override
    public int compareTo(Student student) {
        if(this.age.equals(student.age)){
            return this.name.compareTo(student.name);
        }
        return this.age-student.age;
    }

    @Override
    public String toString() {
        return "name:"+this.name+"-----"+"age"+this.age;
    }
}


// 自己的比较方法，用姓名来比较
class MyStudentCompare implements Comparator<Student> {

    @Override
    public int compare(Student st1, Student st2) {
        if (Objects.equals(st1.getName(), st2.getName())){
            return st1.getAge()-st2.getAge();
        }
        return st1.getName().compareTo(st2.getName());
    }
}