package polymorphism.generalPolymorphism;

import polymorphism.generalPolymorphism.Person;
import polymorphism.generalPolymorphism.Student;
import polymorphism.generalPolymorphism.Teacher;

public class Test {

    public static void main(String[] args) {
        Person p = new Person();
        p.display();

        p = new Teacher();
        p.display();

        p = new Student();
        p.display();





    }
}
