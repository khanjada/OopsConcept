package constructor;

public class Person {
    String name,gender;
    int phone;

    //Constructor is used to initialize the object.
    //constructor is a special type of method,there is no any return type even void.
    //Constructor has same as the class name.
    //Default constructor and parametarize constructor.

    Person(String n,String g,int p){

     name=n;
     gender=g;   // This is example of parametarise Constructor.
     phone=p;
    }

    Person(){
        System.out.println("No value");// This is example of Default Constructor.

    }


    void displayInformation(){
        System.out.println("Name:   "+name);
        System.out.println("Gender:   "+gender);
        System.out.println("Phone:   "+phone);
        System.out.println("\n");
    }
}
