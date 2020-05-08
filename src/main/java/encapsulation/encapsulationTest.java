package encapsulation;

public class encapsulationTest {
    public static void main(String[] args) {

        Person p1=new Person();
        p1.setName("Rony");
        System.out.println("Name:   "+p1.getName());

        p1.setAge(40);
        System.out.println("Age:    "+p1.getAge());

    }
}
