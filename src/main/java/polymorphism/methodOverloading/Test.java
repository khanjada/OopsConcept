package polymorphism.methodOverloading;

public class Test {

    public static void main(String[] args) {

        MethodOverload obj=new MethodOverload();
        obj.add();
        obj.add(5,10);
        obj.add(5,10,10);
        obj.add(10.5,5.3);

    }
}
