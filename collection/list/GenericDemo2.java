package collection.list;

public class GenericDemo2 {

    public static void main(String[] args) {
//        Tool t = new Tool();
//        t.setObject(new Worker());
//        Worker w = (Worker)t.getObject();

        Utils<StudentGen> t = new Utils<>();

        StudentGen studentGen = new StudentGen();
        t.setObject(studentGen);
        StudentGen object = t.getObject();
        System.out.println(object.getClass().getName());

    }

}

class Worker{

}

class StudentGen{

}

class Tool{
    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

}

class Utils<Q>{
    private Q q;
    public void setObject(Q q){
        this.q = q;
    }
    public Q getObject(){
        return q;
    }
}