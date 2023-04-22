enum Level {
    LOW,
    MEDIUM,
    HIGH;


    }

public class Enums {
  static int x=20;
    public static  void main(String[] args){

        Level l1=Level.HIGH;
        switch(l1) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
        Enums e=new Enums();
        e.x=30;
        System.out.println(e.x);


    }
}
