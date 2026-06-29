package collection.list;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Objects;

public class ArrayListDemo2 {

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
        arrayList1.add(new Person(11,"a"));
        arrayList1.add(new Person(11,"b"));
        arrayList1.add(new Person(11,"a"));
        arrayList1.add(new Person(12,"a"));
        arrayList1.add(new Person(12,"b"));
        arrayList1.add(new Person(12,"a"));

        ArrayList removeSameElementPerson = removeSameElementPerson(arrayList1);

        System.out.println(removeSameElementPerson);

    }

    public static ArrayList removeSameElementPerson(ArrayList arrayList){

        ArrayList container = new ArrayList();

        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()){
            Object o = listIterator.next();
            if(!container.contains(o)){
                container.add(o);
            }
        }

        return container;


    }

}

class Person{
    private Integer age;
    private String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(this.age, person.age) && Objects.equals(this.name, person.name);
//        return Objects.equals(age, person.age) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
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
}