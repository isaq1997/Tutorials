import java.util.Date;

class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits = new String[10];
    public Pet(String species,String nickname){

        System.out.println(species+" "+nickname);
    }
    public Pet(String species,String nickname,int age, int trickLevel){

        System.out.println(species+" "+nickname+" "+age+" "+trickLevel);
    }
    public Pet(){

    }
    void eat() {
        System.out.println("I am eating");
    }

    void respond() {
        System.out.println("Hello, owner. I am " + this.nickname + " . I miss you!");
    }

    void foul() {
        System.out.println("I need to cover it up");
    }

    public String toString() {//overriding the toString() method
        String h = "dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}";
        return h;
    }


}

class Human {
    String name;
    String surname;
    int year;
    int IQ;
    Object pet;
    Object mother;
    Object father;
    String[][] schedule = new String[7][2];
    Pet p = new Pet();
    public Human(String name, String surname, int year){
        System.out.println(name+" "+surname+" "+year);


    }
    public Human(String name, String surname, int year,Object mother,Object father){
        System.out.println(name+" "+surname+" "+year+" "+mother+" "+father);


    }
    public  Human(){

    }
    void greetpet() {
        System.out.println("Hello  " + this.pet);
    }

    void describepet() {
        System.out.println("I have a " + p.species + ", he is " + p.age + " years old," + p.trickLevel);
    }

    public String toString() {//overriding the toString() method
        String h = "Human{name='Michael', surname='Karleone', year=1977, iq=90, mother=Jane Karleone, " +
                "father=Vito Karleone, pet=dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}}";
        return h;
    }

}

public class Human_Pet {
    public static void main(String[] args) {

       Pet p=new Pet("Cat","Tom");
       Pet p1=new Pet("Cat","Tom",14,50);
        System.out.println(p1.toString());

        Human h=new Human("John","Wimbsy",1987);
        Human h1=new Human("John","Wimbsy",1987,"Catherine","Mike");
        System.out.println(h.toString());

    }
}
