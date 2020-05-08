package abstraction.general;

public class Test {


        public static void main(String[] args) {
            MobileUser mu; //we can create only refrence variable here.

            mu=new Rahim();
            mu.sendMessage();


            mu=new Karim();
            mu.sendMessage();
        }
    }


