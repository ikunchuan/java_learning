package collection.set;

import java.util.Objects;

public class HashSetDemo2 {
}

class Person{
    private Integer age;
    private String name;

//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof Person person)) return false;
//        return Objects.equals(age, person.age) && Objects.equals(name, person.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(age, name);
//    }
    @Override
    public boolean equals(Object o){
        if(!(o instanceof Person)) return false;
        Person obj = (Person)o;
        return (obj.getName() == this.name && obj.getAge() == this.age);
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

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }
}
