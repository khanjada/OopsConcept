package encapsulation;

public class Person {
   private String name;  //Data Hiding process.
   private int age;

// It's a mechanism to set and get the value from diffrent class to private variables.
   public void setName(String name){
       this.name=name;
   }
   public String getName(){
       return name;
   }
   public void setAge(int age){
       this.age=age;
   }
   public int getAge(){
       return age;
   }

}
