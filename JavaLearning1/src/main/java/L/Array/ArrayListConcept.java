package L.Array;

import java.util.ArrayList;


public class ArrayListConcept {
    static void xyz(){
        ArrayList ar=new ArrayList();
        ar.add(50);
        ar.add(150);
        ar.add(true);
        ar.add(20.40);
     // ar.remove(1);


        System.out.println(ar);
        System.out.println(ar.remove(1));
        System.out.println(ar);
        System.out.println(ar.size());
      System.out.println(ar.remove(2));
        System.out.println(ar);
    }

    public static void main(String[] args) {
        xyz();

    }
}
