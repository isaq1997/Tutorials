class GetSet {
    public GetSet(int n) {

    }

    public GetSet() {
        System.out.println("alle");
    }

    // Member variable of this class
    private static String name;

    // Method 1 - Getter
    public static  String getName() {
        return name;
    }

    // Method 2 - Setter
    public void setName(String N) {

        // This keyword refers to current instance itself
        this.name = N;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        GetSet obj = new GetSet();
        GetSet obj1 = new GetSet(3);
        obj.setName("fdd");
        System.out.println(obj.getName());


    }
}
