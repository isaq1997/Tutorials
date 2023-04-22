
 class stud implements  OOP_İNT {
     int id;
     String name;
     int result;
     static  int j=0;
     static int k=0;

    public  stud(int id, String name,int result) {
        k++;
        this.id = id;
        this.name = name;
        this.result=result;


    }
      int calculate_total(){
         int total;
         total=result*12;
         return total;

     }
    static {
        j++;


    }


    public void get_name() {
        System.out.println("hello");
    }
}


public  class OOP2  {


    public  static  void  main (String[] args){
        stud s1=new stud(1,"Pello",34);
        stud s2=new stud(2,"Lame",45);
        stud s3=new stud(2,"Lame",5);
        System.out.println(s1.name+" "+s2.name);
        System.out.println(stud.j);
        System.out.println(stud.k);
        System.out.println(s2.calculate_total());
       s2.get_name();



    }
}
